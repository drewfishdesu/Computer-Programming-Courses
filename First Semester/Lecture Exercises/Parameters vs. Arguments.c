#include <stdio.h>

int add(int p, int q); // function prototype
int add(int p, int q) // function header
{
    // function body
    int sum = 0;
    sum = p + q;
    return sum;
}

int main()
{
    int x;
    x = add(9, 3);
    printf("%d", x);
    return 0;
}