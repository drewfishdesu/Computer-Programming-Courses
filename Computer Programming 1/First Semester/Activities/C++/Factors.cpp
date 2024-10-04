#include <iostream>
using namespace std;

int main()
{
    int number;
    int count = 1;
    int x = number;

    cin >> number;

    while(count <= x) // Uses a while loop to find and print factors.
    {
        if(number % count == 0) // Check if count is a factor of a number.
        {
            cout << count << " "; // Prints the factor
        }
        count++; // Moves to the next integer
    }
    
    return 0;

}