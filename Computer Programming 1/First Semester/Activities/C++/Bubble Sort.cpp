#include <iostream>
using namespace std;

// The bubble sort arranges all numbers in ascending order.

int main()
{
    int myArray[5] = {3, 4 , 2, 0, 1};
    int temp;

    for(int i = 0; i < 5; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            if(myArray[j] > myArray[j + 1])
            {
                temp = myArray[j];
                myArray[j] = myArray[j + 1];
                myArray[j + 1] = temp;

            }
        }
    }

    for (int x = 0; x < 5; x++)
    {
        cout << myArray[x] << " ";
        return 0;
    }
}