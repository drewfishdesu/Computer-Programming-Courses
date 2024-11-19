#include <iostream>
#include <cstring>
using namespace std;

int main()
{
    string inputString;
    char toReplace, replaceWith;

    getline(cin, inputString); // getline reads the entire string
    cin >> toReplace >> replaceWith; // Reads the two characters to replace and replace with

    for(int i = 0; i < inputString.length(); i++) // Loops the program until all similar letters have been replaced
    {
        if(inputString[i] == toReplace)
        {
            inputString[i] = replaceWith;
        }
    }
    
    cout << inputString << endl;
    
    return 0;
}