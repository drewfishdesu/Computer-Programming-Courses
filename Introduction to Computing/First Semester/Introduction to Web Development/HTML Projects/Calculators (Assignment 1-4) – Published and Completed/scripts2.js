document.addEventListener("DOMContentLoaded", () => {
    const taxableIncomeInput = document.getElementById("taxableIncome");
    const displayIncome = document.getElementById("displayIncome");
    const displayTax = document.getElementById("displayTax");

    // Tax calculation function
    const calculateTax = (income) => {
        if (income <= 250000) return 0; // Tax-free for income <= 250,000
        else if (income <= 500000) return (income - 250000) * 0.15; // 15% tax for next 250,000
        else if (income <= 1000000) return 37500 + (income - 500000) * 0.20; // Add 20% tax for next slab
        else return 137500 + (income - 1000000) * 0.30; // Add 30% tax for income above 1,000,000
    };

    // Event listener for real-time calculation
    taxableIncomeInput.addEventListener("input", () => {
        const income = parseFloat(taxableIncomeInput.value);

        // Validate the input
        if (isNaN(income) || income < 0) {
            displayIncome.textContent = "-";
            displayTax.textContent = "-";
            return;
        }

        // Calculate and update the results
        const tax = calculateTax(income);
        displayIncome.textContent = `₱ ${income.toLocaleString("en-PH")}`;
        displayTax.textContent = `₱ ${tax.toLocaleString("en-PH")}`;
    });
});