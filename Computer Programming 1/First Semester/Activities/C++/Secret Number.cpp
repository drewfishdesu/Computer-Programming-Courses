#include <iostream>
#define SECRET_NUM 27
using namespace std;

int main()
{
    int try_num;
    int stars = 5;

    for (int i = 0; i < 5; i++)
    {
        cin >> try_num; // Gets user input

        if (try_num == SECRET_NUM)
        {
            cout << "GGWP, you guessed correctly!" << endl;
            break; // Exits the program if the number is guessed correctly.
        }

        else
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

            if (stars == 0)
            {
                cout << "You lost!" << endl;
            }
        }

    }
    return 0;
}