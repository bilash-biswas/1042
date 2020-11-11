#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    int a,b,c;
    cin>>a;
    cin>>b;
    cin>>c;
    if(a > b && a > c)
    {
        if(b > c)
        {
            cout<<c<<endl;
            cout<<b<<endl;
            cout<<a<<endl;
        }
        else
        {
            cout<<b<<endl;
            cout<<c<<endl;
            cout<<a<<endl;
        }
    }
    else if(b > c && b > a)
    {
        if(a > c)
        {
            cout<<c<<endl;
            cout<<a<<endl;
            cout<<b<<endl;
        }
        else
        {
            cout<<a<<endl;
            cout<<c<<endl;
            cout<<b<<endl;
        }
    }
    else
    {
        if(a > b)
        {
            cout<<b<<endl;
            cout<<a<<endl;
            cout<<c<<endl;
        }
        else
        {
            cout<<a<<endl;
            cout<<b<<endl;
            cout<<c<<endl;
        }
    }
    cout<<endl;
    cout<<a<<endl;
    cout<<b<<endl;
    cout<<c<<endl;
    return 0;
}
