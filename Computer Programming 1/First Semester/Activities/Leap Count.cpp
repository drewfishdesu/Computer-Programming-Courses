#include <iostream>
using namespace std;

int main()
{
    int birthYear;
    int currentYear = 2024;
    int leapYearCount = 0;

    // Gets the input for the birth year.
    cin >> birthYear;

    // Tells the program to start from the year after the person's birth year.

    int year = birthYear + 1;

    // Uses a loop to count leap years until the current year.

    while (year <= currentYear)
    {
        // Checks if the year is a leap year.
        if (year % 4 == 0)
        {
            leapYearCount++;
        }
        year++;
    }

    // Outputs the result.
    cout << "Leap year count is : " << leapYearCount << endl;

    return 0;
}