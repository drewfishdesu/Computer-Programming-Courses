#include <iostream>
using namespace std;

void myFunction(int ma[], int size)
{
    for(int i = 0; i < size; i++)
        cout << ma[i] << "\n";
}

int main()
{
    int myArray[3] = {1, 2, 3};

    myFunction(myArray, 3);
    return 0;
}