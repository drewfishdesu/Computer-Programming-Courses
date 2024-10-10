#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    double total_purchase;
    double current_purchase;
    float discount_rate;
    
    do
    {
        cin >> current_purchase; // Asks for user input (in pesos)

        if (current_purchase > 0)
        {
            total_purchase += current_purchase;
        }
    }
    while (current_purchase != 0); // Continue the program until user inputs 0
    
    // Determines the discount rate based on the total purchase amount.
    if (total_purchase >= 7500)
    {
        discount_rate = 0.25; // 25% discount
    }
    else if (total_purchase >= 5000) // 12.5% discount
    {
        discount_rate = 0.125;
    }
    else if (total_purchase >= 2500) // 6.25% discount
    {
        discount_rate = 0.0625; 
    }
    else // No discount
    {
        discount_rate = 0.0;
    }

    // Calculates the discounted price
    double discounted_amount = total_purchase * discount_rate; // Gets the amount subtracted to total price
    double final_amount = total_purchase - discounted_amount; // Subtracts discount to total price.

    // Prints the discounted amount
    cout << fixed << setprecision(2); // Sets output format to 2 precision values.
    cout << final_amount << endl;

    return 0;
}