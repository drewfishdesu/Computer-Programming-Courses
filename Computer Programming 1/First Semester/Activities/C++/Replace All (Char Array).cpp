#include <cstring>
#include <iostream>
using namespace std;

int main()
{
    char word[30]; // Input string
    char toReplace; // Character to be replaced
    char replaceWith; // Character to be used as replacement

    cin.get(word, 30);
    cin >> toReplace >> replaceWith; // Receives input from user

    for(int x = 0; x < strlen(word); x++) // Loops through each word in the word variable
    {
        if(word[x] == toReplace) // If letter matches toReplace
        {
            word[x] = replaceWith; // Letter is replaced with replaceWith
        }
    }

    cout << word;
    return 0;
}