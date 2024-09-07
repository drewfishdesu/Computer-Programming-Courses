#include <stdio.h>
#include <math.h>
#define PI 3.14159

float circleArea(float dm); // Function Prototype
float circleArea(float dm) // Function Header
{
    // Function Body
    float radius = (dm / 2);
    float comp = PI * pow(radius, 2);
    return comp;
}

float circumference(float dm); // Function Prototype
float circumference(float dm) // Function Header
{   
    // Function Body
	float comp = (PI * dm);
	return comp;
}
int main()
{
    // Declare variables.

    float dm;
    float comp;
    float radius;
    float value;
    int choice;

    // Asks user which calculation to do.
	// 1 for area; 2 for circumference.

    scanf("%d %f", &choice, &dm);

    if(choice == 1)
    {	
        // Gets value from function call circleArea and prints the value.
    	comp = circleArea(dm);
        printf("%.2f", comp);
    }
    
    if(choice == 2)
    {
        // Gets value from function call circumference and prints the value.
    	comp = circumference(dm);
    	printf("%.2f", comp);
	}
}
