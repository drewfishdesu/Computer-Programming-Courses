#include <iostream>
using namespace std;

int main()
{
    int numbers[20]; // Array that can hold up to 20 integers
    int counter = 0; // Counter for numbers inputted

    for(int i = 0; i < 20; i++)
    {
        // Initializes and asks the user for an integer value.
        int value;
        cin >> value;

        if(value == -1) // Ends the program if the inputted value is -1
        {
            break;
        }

        numbers[counter++] = value; // Stores the value in the numbers array and tallies the counter by 1.
    }

    // Removes the zeroes from the array
    int nonzeroCounter = 0; // Counts the non-zero elements

    for(int i = 0; i < counter; i++)
    {
        if(numbers[i] != 0)
        {
            numbers[nonzeroCounter++] = numbers[i];
        }
    }

    // Outputs the array after removing the zeroes
    for(int i = 0; i < nonzeroCounter; i++)
    {
        cout << numbers[i] << " ";
    }

    return 0;
}