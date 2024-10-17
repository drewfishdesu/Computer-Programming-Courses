#include <iostream>
#define SECRET_NUM 27
using namespace std;

int main()
{   
    // Defines variables
    int try_num;
    int stars = 5;

    for (int i = 0; i < 5; i++)
    {
        cin >> try_num; // Gets user input

        if (try_num == SECRET_NUM) // If number is guessed correctly.
        {
            cout << "GGWP, you guessed correctly!" << endl;
            break; // Exits the program if the number is guessed correctly.
        }

        else // If number is guessed incorrectly.
        {
            stars--; // Deducts a star per incorrect guess.
            if (try_num < SECRET_NUM)
            {
                // If number is too low.
                cout << "Too low, guess higher. " << stars << " stars remain." << endl;
            }
            else
            {
                // If number is too high.
                cout << "Too high, guess lower. " << stars << " stars remain." << endl;
            }

            if (stars == 0) // Terminates the program if the user runs out of attempts.
            {
                cout << "You lost!" << endl;
            }
        }

    }
    return 0;
}