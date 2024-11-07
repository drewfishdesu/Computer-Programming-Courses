#include <iostream>
using namespace std;

// Function to remove zeroes from the array
void remZeroes(int arr[], int &count)
{
    int newCount = 0; // Tracks the number of nonzero elements
    for (int i = 0; i < count; i++) // Loops over the array and copies the nonzero elements
    {
        if (arr[i] != 0)
        {
            arr[newCount++] = arr[i]; // Places the nonzero elements forward
        }
    }
    count = newCount; // Updates the counter with the number of valid elements in the array
}

int main()
{
    int numbers[20];  // Array to hold up to 20 integers
    int count = 0;    // Counter for how many numbers have been inputted

    // Loop to fill the array and to stop when -1 is entered
    for (int i = 0; i < 20; i++)
    {
        int value;
        cin >> value;

        if (value == -1)
        {
            break;  // Stop when -1 is entered
        }

        numbers[count++] = value;  // Store the value in the array
    }

    // Calls the function to remove zeroes
    remZeroes(numbers, count);

    // Outputs the array without the zeroes in one line
    for (int i = 0; i < count; i++)
    {
        cout << numbers[i] << " ";  // Print each element followed by a space
    }
    cout << endl;  // Move to the next line after printing all the numbers

    return 0;
}