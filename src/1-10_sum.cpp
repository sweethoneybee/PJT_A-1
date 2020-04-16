#include <iostream>
using namespace std;

int main(void)
{
    int sum = 0;
    for(int i = 1; i <= 10; i++)
    {
        sum += i;
    }

    cout << "1-10 sum : " << sum << endl;
    return 0;
}