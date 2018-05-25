#include<stdio.h>

void main()
{
    int n,i,item,loc;

    printf("\nNo of elements: ");
    scanf("%d",&n);

    int arr[n];

    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);

    printf("\nEnter element to search: ");
    scanf("%d",&item);

    int beg=0,end=n, mid=(beg+end)/2;

    while(beg<=end && arr[mid]!=item)
    {
        if(item<arr[mid])
            end=mid-1;
        else
            beg=mid+1;

        mid=(beg+end)/2;
    }

    if(arr[mid]==item)
        loc=mid;

    else
        loc=NULL;


    if(loc==NULL)
        printf("\nNot Found!");

    else
        printf("\nFound at %d",loc+1);
}
