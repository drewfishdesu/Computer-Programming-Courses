#include <stdio.h>

float billAmt;

float calcDCPrice(float billAmount); // Function Prototype
float calcDCPrice(float billAmount) // Function Header

{
	
    // Function Body
    
	float discountedAmt;
	float discountRate;
	
    if (billAmount < 0)
	{
		return -1;
	}
	
    // Determines the discount rate
	
    if (billAmount < 100) // No discount
    {
        discountRate = 0;
    }
    else if (billAmount >= 100 && billAmount <= 300) // 10% Discount
    {
        discountRate = 10;
    }
    else // 20% Discount
    {
        discountRate = 20;
    }
    discountedAmt = billAmount * (1 - (discountRate / 100));
    return discountedAmt;
}

int main()
{
    float billAmt;
    float discountedAmt;

    scanf("%f", &billAmt);
    
   	discountedAmt = calcDCPrice(billAmt);
   	
   	if(discountedAmt != -1) // Checks for valid result
   	{
   		printf("%.2f", discountedAmt);
	}
	else
	{
		printf("Invalid Amount!");
	}
    
	return 0;
}