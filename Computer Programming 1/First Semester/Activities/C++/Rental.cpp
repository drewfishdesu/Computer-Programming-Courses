#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    
    // Variable declaration
    int tot_VCD; // Total number of VCDs rented
    int num_days; // Loan time amount (in days)
    float current_rental; // Rental price of a VCD
    float total_rental = 0; // Float to accumulate total rental cost

    // Asks for user input
    cin >> tot_VCD;
    cin >> num_days;

    int i;
    for(i = 0; i < tot_VCD; i++) // Loop for Rental Calculation
    {   
        // Asks for the current rental price of a VCD
        cin >> current_rental;
        total_rental += current_rental;
    }

    // Total rental cost is multiplied by number of days
    total_rental *= num_days;

    // Outputs the final price of all rented VCDs for x number of days.
    cout << fixed << setprecision(2) << total_rental;

    return 0;
 }