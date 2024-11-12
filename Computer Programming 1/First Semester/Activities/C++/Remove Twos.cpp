#include <iostream>
using namespace std;

int main()
{
    int value[10]; // Array that can fit 10 integers
    int count = 0; // To track how many numbers were input
    int input;

    // Asks for user input, tells the program to stop if -1 is typed in.
    
    while (count < 10)
    {
    	cin >> input;
	    if(input == -1)
	    {
	        break;
	    }
	    else
	    {
	    	value[count] = input; // Stores the input in the array
	    	count++; // Tallies the number of integers typed in
		}
	}
	    

    // Removes the numbers divisible by 2.
    int result[0]; // Array to store the filtered results
    int resultCount = 0; // Tracks the number of filtered numbers in the array

    // Loops through the original array and stores only the odd numbers
    for (int i = 0; i < count; i++)
    {
        if (value[i] % 2 != 0) // If numbers in the array are not divisible by two
        {
            result[resultCount] = value[i];
            resultCount++;
        }
    }

    // Outputs the filtered array.
    for (int i = 0; i < resultCount; i++)
    {
        cout << result[i] << " ";
    }
    cout << endl;
    
    return 0;
}