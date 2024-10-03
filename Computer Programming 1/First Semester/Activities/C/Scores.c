#include <stdio.h>

void printMessage(int score); // Function prototype
void printMessage(int score) // Function header
{
    // If-else statements
    // && is used to indicate a range.
    if(score >= 95 && score <= 100)
    {
        printf("Excellent!");
    }
    else if(score >= 85 && score <= 94)
    {
        printf("You did well!");
    }
    else if(score >= 75 && score <= 84)
    {
        printf("You did fine!");
    }
    else if(score >= 60 && score <= 74)
    {
        printf("You passed!");
    }
    else if(score > 100)
    {
        printf("Invalid score!");
    }
    else
    {
        printf("Try harder next time!");
    }
}

int main()
{
    // Declare variables
    int score;
    
    printf("Input a score from 0-100. ");
    scanf("%d", &score);
	
	// Calls the printMessage function.
	
	printMessage(score);

return 0;

}