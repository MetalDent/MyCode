#include<stdio.h>

void main()
{
    int n,i,min,j,temp;
    printf("\nNo of elements: ");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);

    for(i=0;i<n-1;i++)
    {
        min=i;

        for(j=i+1;j<n;j++)
        {
            if(arr[j]<arr[min])
                min=j;
        }

        if(min!=i)
        {
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

     for(i=0;i<n;i++)
        printf("\n%d",arr[i]);
}