#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            char ch = 'A' + j;
            cout << ch;
        }
        for (int k = i; k > 0; k--)
        {
            char ch = 'A' + k - 1;
            cout << ch;
        }
        cout << endl;
    }
}