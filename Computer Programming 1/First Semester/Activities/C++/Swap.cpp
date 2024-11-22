#include <cstring>
#include <iostream>
using namespace std;

int main()
{
    char input[30]; // Input string
    char toReplace; // Character to be replaced
    char replaceWith; // Character to be used as replacement

    cin.get(input, 30);
    cin >> toReplace >> replaceWith;

    bool found = false; // Flag to check if one of the characters are found in the string

    for(int x = 0; x < strlen(input); x++)
    {
        if(input[x] == toReplace && input[x] == replaceWith)
        {
            found = true; // If both letters are found
            break;
        }
    }

    if (!found)
    {
        cout << "Error!" << endl;
        return 0;
    }

    for(int x = 0; x < strlen(input); x++)
    {
        if(input[x] == toReplace)
        {
            input[x] = replaceWith;
        }
        else if (input[x] == replaceWith)
        {
            input[x] = toReplace;
        }
    }

    cout << input << endl;
    return 0;
}