#include <cstring>
#include <iostream>
using namespace std;

int main()
{
    char word[50];
    int vowelCount = 0;
    char vowels[10] = {'a', 'i', 'e', 'o', 'u', 'A', 'I', 'E', 'O', 'U'};
    
    cin.get(word, 50);
    for(int i = 0; i < strlen(word); i++)
    {
        for(int j = 0; j < 10; j++)
        {
            if(word[i] == vowels[j])
            {
                vowelCount++;
            }
        }
    }

    cout << "Vowels: " << vowelCount << endl;
    return 0;
}