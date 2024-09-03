#include <stdio.h>
#define PI 3.14159

int main()

// Declare variables.

{
    float dm;
    float comp;
    float radius;
    int choice;
    
    // Asks user which calculation to do.
	// 1 for area; 2 for circumference.

    scanf("%d %f", &choice, &dm);
    
    // Area calculation:

    if(choice == 1)
    {
        float radius = (dm / 2);
		float comp = (PI * radius * radius);
        printf("%.2f", comp);
        return comp;
    }
    
    // Circumference calculation:
    
    else if(choice == 2)
    {
    	float comp = (PI * dm);
    	printf("%.2f", comp);
    	return comp;
	}
	
	// If choice != 1 or 2, print Invalid Input
	
	else
	{
		printf("Invalid Input");
	}

    return 0;
}
