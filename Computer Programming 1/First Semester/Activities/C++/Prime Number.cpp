#include <iostream>
#include <cmath>
using namespace std;

bool isPrime(int num) 
{
    if(num <= 1)
    {
        return false;
    }
    for(int i = 2; i * i <= num; i++)
    {
        if(num % i == 0)
        {
            return false;
        }
    }
    return true;
}

int main()
{
    int num;

    cin >> num;

    if(num <= 1)
    {
        cout << "Error!" << endl;
    }
    else
    {
        if(isPrime(num)) 
        {
            cout << "Prime" << endl;
        }
        else
        {
            cout << "Not Prime" << endl;
        }
    }
    return 0;
}