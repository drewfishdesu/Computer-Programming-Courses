#include <iostream>
using namespace std
#define PI 3.14159

int main()

// Declare variables

{
    float diameter;
    float computation;
    float radius;
    int choice;

    cout<<"What computation would you like to do?";
    cout<<"\N";
    cout<<"1 for area, 2 for circumference";
    cout<<"\N";
    cout<<"\N";
    
    cin>>choice;

    if(choice == 1)
    {
        float radius = (diameter / 2);
        float computation = (PI * radius * radius)
        cout<<computation;
        return computation;
    }

    if(choice == 2)
    {
        float computation = (PI * diameter);
        cout<<computation;
        return comp;
    }

    else
    {
        cout<<"Invalid Input";
    }

    return 0;
}