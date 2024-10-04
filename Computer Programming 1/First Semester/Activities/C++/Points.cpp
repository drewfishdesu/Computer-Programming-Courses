#include <iostream>
using namespace std;

int main()
{
    float purch; // User input
    int points = 0; // Sets user points to zero.

    cout << "Enter purchase amount in pesos: ";
    cin >> purch; // Asks for user input (in pesos)

    // Check for invalid input
    if (purch < 0) {
        cout << "Invalid Input!" << endl;
        return 1; // Exit if input is invalid
    }

    // Calculate updated points based on the total purchase
    int updatedPoints = ((purch) / 50) * 4;

    // Use a while loop to simulate threshold points accumulation
    while (purch >= 50)
    {
        points += 4; // Award 4 points per full threshold
        purch -= 50; // Decrease purchase amount by threshold
    }

    // Determine reward based on the original purchase amount
    if (points >= 1000)
    {
        cout << "Calculated Points: " << points << ". You get an iPad Mini." << endl;
    }
    else if (points >= 800)
    {
        cout << "Calculated Points: " << points << ". You get a Rechargeable Mini Fan." << endl;
    }
    else if (points >= 500)
    {
        cout << "Calculated Points: " << points << ". You get a Coffee Maker." << endl;
    }
    else if (points >= 250)
    {
        cout << "Calculated Points: " << points << ". You get an Oven Toaster." << endl;
    }
    else
    {
        cout << "Calculated Points: " << points << ". You get nothing." << endl;
    }

    return 0;
}
