#include <stdio.h>

int main()
{
	
	// Declare variables.
	
	int choice;
	float celsius;
	float fahrenheit;
	
	// Asks the use which conversion to use.
	// 1 for Celsius to Fahrenheit; 2 for Fahrenheit to Celsius
	
	scanf("%d", &choice);
	
	// If choice is 1, convert celsius to fahrenheit.
	
	if(choice == 1)
	{
		scanf("%f.1f", &celsius);
		float fahrenheit = (celsius * (9.0/5.0) + 32);
		printf("%.1f", fahrenheit);
		return fahrenheit;
		
	}
	
	// If choice is 2, convert fahrenheit to celsius.
	
	else if(choice == 2)
	{
		scanf("%f", &fahrenheit);
		float celsius = ((fahrenheit - 32) * (5.0/9.0));
		printf("%.1f", celsius);
		return celsius;
	}
	
	// If choice != 1 or 2, print Invalid Output
	
	else
	{
		printf("Invalid input.");
	}
	return 0;
}

*/