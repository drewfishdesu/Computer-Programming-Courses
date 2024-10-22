#include <iostream>
using namespace std;

int main()
{
    int decimal;
    int binary = 0;
    int place = 1;

    cin >> decimal;

    if(decimal < 0) // Error handling for negatuve integer.
    {
        cout << "Please enter a non-negative integer." << endl;
        return 1;
    }

    if(decimal == 0) // Hard-coded binary equivalent for 0.
    {
        cout << "Binary equivalent: 0" << endl;
        return 0;
    }

    while(decimal > 0)
    {
        int remainder = decimal % 2;
        binary += remainder * place;
        decimal /= 2;
        place *= 10; // Moves to the next place value.
    }

    cout << binary << endl; // Outputs the completed binary code.

    return 0;
}