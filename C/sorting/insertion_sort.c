#include<stdio.h>

void main()
{
    int n,i,j,k;
    printf("\nNo of elements: ");
    scanf("%d",&n);

    int arr[n];

    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);

    for(i=1;i<n;i++)
    {
        int k=arr[i];

        for(j=i-1;j>=0 && k<arr[j];j--)
            arr[j+1]=arr[j];

        arr[j+1]=k;
    }

    for(i=0;i<n;i++)
        printf(" %d",arr[i]);
}
