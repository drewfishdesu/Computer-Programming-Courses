// Create a program which takes in the height and width of a box, and outputs a box made up of a character.

#include <iostream>
#include <cstring>
using namespace std;

int main()
{
    int height;
    int width;

    // Gets the dimensions of the box.
    cin >> width; 
    cin >> height;

    // Prints the box
    for(int i = 0; i < height; i++)
    {
        for(int j = 0; j < width; j++)
        {
            cout << "-"; // Prints the characters
        }
        cout << endl;
    }
    return 0;
}