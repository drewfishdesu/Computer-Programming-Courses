#include <stdio.h>

int main()

// Declare variables
{
    float crit_damage;
    float crit_rate;
    float crit_value;

    // Prints a message indicating that the program is functioning.

    printf("\n");
    printf("Welcome to the artifact calculator. Input your crit damage followed by the crit rate.");
    printf("\n");
    printf("Example: 21 10.5");
    printf("\n");

    // Receives input from the user (crit damage, crit rate)

    printf("\n");
    scanf("%f %f", &crit_damage, &crit_rate);

    // Crit value calculation

    crit_value = ((crit_rate * 2) + crit_damage);

    // Prints the crit value for your artifact.

    printf("\n");
    printf("Your artifact has %.2f CV.", crit_value);

    // Ends the program.

    return 0;

}