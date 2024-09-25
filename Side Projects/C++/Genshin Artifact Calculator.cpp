#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    // Define variables
    float crit_damage;
    float crit_rate;
    float crit_value;
    char choice;

    cout << "Welcome to the Genshin Artifact Calculator" << endl;

    do
    {
        cout << "To get started, type your CRIT Rate followed by your CRIT DMG." << endl;
        cout << "For example, 21.8 14.4" << endl;

        // Asks the user for input.
        cin >> crit_rate >> crit_damage;

        // Calculates the crit value of an artifact.
        crit_value = (crit_rate * 2) + crit_damage;
        
        // Prints the crit value of an artifact.
        cout << fixed << setprecision(2);
        cout << "Your artifact crit value is: " << crit_value << endl;

        // Asks the user if they want to continue.
        cout << "Do you want to calculate again? (y/n)" << endl;
        cin >> choice;
    } while (choice == 'y' || choice == 'Y');

    cout << "Thank you for using the artifact calculator!" << endl;
    return 0;
}