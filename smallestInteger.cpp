
#include <iostream>
using namespace std;
void small(int a);

int main()
{
    int a;
    cin>>a;
    small(a);
}
void small(int a)
{
    int i,j=0;
    int arr[100];
    //cin>>a;
    if(a<10)
    {
        cout<<10+a;
        return;
    }
    for(i=9;i>1;i--)
    {
        while(a%i == 0)
        {
            a=a/i;
            arr[j]=i;
            j++;
        }
    }
    if(a>10)
    {
        cout<<"not possible";
        return;
    }
    
    for(i=j-1;i>=0;i--)
    {
        cout<<arr[i];
    }
}
