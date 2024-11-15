// Get input value (N)
function calculate() {
    const N = parseInt(document.getElementById("numberInput").value);
    if (isNaN(N) || N < 1) {
        alert("Please use a valid positive integer.");
        return;
    }

    // Get factorials using a while loop
    let factorial = 1;
    let i = 1;
    while (i <= N) {
        factorial *= i;
        i++;
    }

    // Sum using do-while loop
    let sum = 0;
    let j = 1;
    do {
        sum += j;
        j++;
    } while (j <= N);

    // Average using a for loop
    let average = 0;
    let total = 0;
    for (let k = 1; k <= N; k++) {
        total += k
    }
    average = total / N;

    // Shows the results on the page
    document.getElementById("factorialResult").textContent = factorial.toFixed(2);
    document.getElementById("sumResult").textContent = sum;
    document.getElementById("averageResult").textContent = average.toFixed(2);

    // Updates the factorial result (in scientific notation)
    if(factoral > 1e15) {
        // Two significant digits
        document.getElementById("factorialResult").textContent = factorial.toFixed(2);
    } else { // Display normally
        document.getElementById("factorialResult").textContent = factorial;
    }
}

