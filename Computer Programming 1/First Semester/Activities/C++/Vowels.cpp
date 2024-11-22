#include <iostream>
#include <cstring>
#include <cctype>
using namespace std;

int countVowels(const char str[])
{
    int vowelCount = 0; // Variable to count variables

    // Loops through each character of the string
    for(int i = 0; i < strlen(str); i++)
    {
        char ch = tolower(str[i]); // Converts all characters to lowercase to handle both uppercase and lowercase

        //  Checks if the character is a vowel
        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            vowelCount++; // Increase the vowel count if a vowel is found in a string
        }
    }

    return vowelCount; // Returns the total number of vowels
}

int main()
{
    char input[101]; // Array to store the input string

    cin.getline(input, 101); // Asks for user input.
    int vowelCount = countVowels(input);

    cout << "Vowels: " << vowelCount << endl;
    return 0;
}