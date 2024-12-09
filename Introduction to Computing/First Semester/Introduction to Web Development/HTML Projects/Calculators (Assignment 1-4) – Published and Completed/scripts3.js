// Function to calculate factorial, sum, and average
function calculate() {
    const N = parseInt(document.getElementById("numberInput").value);

    // Input validation: Check if N is a valid positive integer
    if (isNaN(N) || N < 1) {
        document.getElementById("factorialResult").textContent = "-";
        document.getElementById("sumResult").textContent = "-";
        document.getElementById("averageResult").textContent = "-";
        return; // Exit if the input is invalid
    }

    // Calculate factorial using a while loop
    let factorial = 1;
    let i = 1;
    while (i <= N) {
        factorial *= i;
        i++;
    }

    // Calculate sum using a do-while loop
    let sum = 0;
    let j = 1;
    do {
        sum += j;
        j++;
    } while (j <= N);

    // Calculate average using a for loop
    let total = 0;
    for (let k = 1; k <= N; k++) {
        total += k;
    }
    let average = total / N;

    // Update the results in the HTML
    // Display factorial in scientific notation if it's very large
    document.getElementById("factorialResult").textContent = 
        factorial > 1e15 ? factorial.toExponential(2) : factorial;

    document.getElementById("sumResult").textContent = sum;
    document.getElementById("averageResult").textContent = average.toFixed(2);
}

// Add event listener to update results in real-time
document.getElementById("numberInput").addEventListener("input", calculate);