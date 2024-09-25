#include <iostream>
#include <iomanip> // Include for std::setprecision
using namespace std;

#define PI 3.14159

int main()

{

    // Declare variables

    float diameter;
    float computation;
    float radius;
    int choice;

    // Asks the user for input

    cout << "What computation would you like to do?" << endl;
    cout << "1 for area, 2 for circumference" << endl;
    
    cin >> choice;

    cout<<"What is the diameter of your circle?" << endl;
    cin >> diameter;

    // Calculates based on user input.

    if(choice == 1) // Calculate area
    {
        float radius = (diameter / 2); // Calculates radius
        float computation = (PI * radius * radius); // Calculates the area
        cout << fixed << setprecision(2); // Sets output format to fixed and precision to 2 decimal places only.
        cout << computation << endl;
    }
 
    else if(choice == 2) // Calculate circumference
    {
        float computation = (PI * diameter);
        cout << fixed << setprecision(2); // Sets output format to fixed and precision to 2 decimal places only.
        cout << computation << endl;
    }

    else
    {
        cout<<"Invalid Input" << endl;
    }

    return 0;
}