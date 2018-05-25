#include<stdio.h>

void main()
{
    int n,item,i,loc=0;

    printf("\nNo of elements: ");
    scanf("%d",&n);

    int arr[n];
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);

    printf("\nEnter element to search: ");
    scanf("%d",&item);

    arr[n+1]=item;

    while(arr[loc]!=item)
        loc=loc+1;

    if(loc==n+1)
        loc=0;

    if(loc==0)
        printf("\nNot Found!");

    else
        printf("\nFound at %d",loc+1);
}
