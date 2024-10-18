#include <iostream>
using namespace std;

int main()
{
    int current_number;
    int smallest_number;
    int count = 0;

    for (int i = 0; i < 10; i++)
    {
        cin >> current_number; // Gets user input

        if (current_number == -1)
        {
            break; // Stop if -1 is entered.
        }
        else if (current_number < -1)
        {
            cout << "Invalid Input" << endl;
            return 0; // Exits the program on invalid input
        }
        else
        {
            if (count == 0 || current_number < smallest_number) // Find the smallest number
            {
                smallest_number = current_number; // Updates the smallest number
            }
            else if (count == 0) // Initialize smallest_number on first valid input
            {
                smallest_number = current_number;
            }
            count++;
        }
    }

    // Checks the conditions for output
    if (count == 0)
    {
        cout << "Invalid Input" << endl;
    }
    else
    {
        cout << "Smallest value is: " << smallest_number << endl;
        cout << "Total numbers entered: " << count << endl;
    }

    return 0;
}
