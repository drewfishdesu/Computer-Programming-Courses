#include <iostream>
using namespace std;

int main()
{
    int number;
    int count = 1;
    int x = number;

    cin >> number << endl;

    while(count <= x) // Uses a while loop to find and print factors.
    {
        if(number % count == 0) // Check if count is a factor of a number.
        {
            cout << count << " " << endl; // Prints the factor
        }
        count++; // Moves to the next integer
    }
    
    cout << endl; // Prints a new line at the end
    return 0;

}