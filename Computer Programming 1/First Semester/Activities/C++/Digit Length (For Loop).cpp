#include <iostream>
using namespace std;

int main()
{
    int number;
    int count = 0;

    cin >> number;

    for(number = number; number > 0; number /= 10)
    {
        count++;
    }
    if(count % 2 == 0) // even
    {
        cout << "Number's length is " << count << " and is even.";
    }
    else
    {
        cout << "Number's length is " << count << "and is odd.";
    }

    return 0;
}