#include <iostream>
using namespace std;

int main()
{
    int decimal;
    int remainder = 0;
    int octalDigit = 0;
    int placeValue = 1;

    // User input
    cin >> decimal;
    int originalDecimal = decimal; // Stores the original decimal value.

    if (decimal < 0) // Error handling
    {
        cout << "Please enter a non-negative integer." << endl;
        return 1;
    }

    while (decimal > 0)
    {
        remainder = decimal % 8; // Gets the remainder of the decimal divided by 8.
        octalDigit += remainder * placeValue; // Builds the octal number
        decimal /= 8; // Reduces the decimal number
        placeValue *= 10; // Updates the place value
    }

    // Output
    cout << "Octal equivalent of " << originalDecimal << " is " << octalDigit << "." << endl;

    // End code.
    return 0;
}