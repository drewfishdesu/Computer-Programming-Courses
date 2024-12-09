// Celsius to Fahrenheit Converter
function convertCelsiusToFahrenheit() {
    const celsius = document.getElementById('celsiusInput').value;
    if(celsius !== '') {
        const fahrenheit = ((celsius * 9/5) + 32).toFixed(2)
        document.getElementById('celsiusResult').innerText = fahrenheit + '°F';
    } else {
        document.getElementById('celsiusResult').innerText = "Please enter a valid number.";
    }
}

// Fahrenheit to Celsius Converter
function convertFahrenheitToCelsius() {
    const fahrenheit = document.getElementById('fahrenheitInput').value;
    if(fahrenheit !== '') {
        const celsius = ((fahrenheit - 32) * 5/9).toFixed(2);
        document.getElementById('fahrenheitResult').innerText = celsius + '°C';
    } else {
        document.getElementById('fahrenheitResult').innerText = "Please enter a valid number.";
    }
}

// Meters to Feet Converter
function convertMetersToFeet() {
    const meters = document.getElementById('metersInput').value;
    if(meters !== '') {
        const feet = (meters * 3.281).toFixed(2);
        document.getElementById('metersResult').innerText = feet + " ft.";
    } else {
        document.getElementById('metersResult').innerText = "Please enter a valid number.";
    }
}

// Feet to Meters Converter
function convertFeetToMeters() {
    const feet = document.getElementById('feetInput').value;
    if(feet !== '') {
        const meters = (feet / 3.281).toFixed(2);
        document.getElementById('feetResult').innerText = meters + "m";
    } else {
        document.getElementById('feetResult').innerText = "Please enter a valid number.";
    }
}

// Animations
window.addEventListener('scroll', function () {
    const calculators = document.querySelectorAll('.calculator-box');

    calculators.forEach(function (box) {
        const boxPosition = box.getBoundingClientRect().top; // Get the position of the box
        const windowHeight = window.innerHeight; // Get the height of the viewport

        // If the box is in the viewport
        if (boxPosition < windowHeight - 100) {
            box.classList.add('fade-in'); // Add fade-in class to trigger the animation
        }
    });
});