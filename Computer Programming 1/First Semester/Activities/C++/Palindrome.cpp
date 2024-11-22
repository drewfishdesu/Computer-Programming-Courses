#include <iostream>
#include <cstring>
using namespace std;

bool isPalindrome(const char str[])
    {
        int length = strlen(str); // Gets the length of the string

        // Loops through the string to check if it is a palindrome
        for (int i = 0; i < length / 2; i++)
        {
            if(str[i] != str[length - i - 1])
            {
                return false; // If any character does not match
            }
        }

        return true;
    }

int main()
{
    char input[51]; // Array to store the input string

    cin.getline(input, 51);

    // Checks if the string is a palindrome
    if (isPalindrome(input))
    {
        cout << "Palindrome" << endl;
    }
    else
    {
        cout << "Not Palindrome" << endl;
    }

    return 0;
}

    