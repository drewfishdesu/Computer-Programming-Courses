#include <stdio.h>
float circleArea(float dm); // function prototype

float circleArea(float dm) // function header
{
    // function body
    float radius = dm / 2.0;
    float area = PI * pow(radius, 2);
    return area;
}
int main()
{
    ...
}