function calculatTax() {
    // Gets the taxable income input
    const taxableIncome = parseFloat(document.getElementById("taxableIncome").value);

    // Checks if the input is a valid number (error handling)
    if (isNaN(taxableIncome) || taxableIncome < 0) {
        alert("Please enter a valid positive number for taxable income");
        return;
    }

    let tax = 0

    // Tax Calculation
    if (taxableIncome <= 250000) {
        tax = 0; // No tax
    } else if (taxableIncome <= 400000) {
        tax = (taxableIncome - 250000) * 0.20; // 20% on the excess over 250,000
    } else if (taxableIncome <= 800000) {
        tax = 30000 + (taxableIncome - 400000) * 0.25; // 30,000 + 25% on excess over 400,000
    } else if (taxableIncome <= 2000000) {
        tax = 130000 + (taxableIncome - 800000) * 0.30; // 130,000 + 30% on excess over 800,000
    } else if (taxableIncome <= 8000000) {
        tax = 490000 + (taxableIncome - 2000000) * 0.32; // 490,000 + 32% on excess over 2,000,000
    } else {
        tax = 2410000 + (taxableIncome - 8000000) * 0.35; // 2,410,000 + 35% on excess over 8,000,000
    }

    // Displays the calculated tax and taxable income
    document.getElementById("displayIncome").textContent = "₱" + taxableIncome.toLocaleString();
    document.getElementById("displayTax").textContent = "₱" + taxableIncome.toLocaleString();
}