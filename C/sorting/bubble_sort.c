#include<stdio.h>

void main()
{
    int n,k,temp;
    printf("\nNo of elements: ");
    scanf("%d",&n);
    int arr[n];
    for(k=0;k<n;k++)
        scanf("%d",&arr[k]);

    for(k=1;k<n;k++)
    {
        int ptr=0;
        while(ptr<=n-k)
        {
            if(arr[ptr]>arr[ptr+1])
            {
                temp=arr[ptr];
                arr[ptr]=arr[ptr+1];
                arr[ptr+1]=temp;
            }

            ptr=ptr+1;

        }
    }

    for(k=0;k<n;k++)
        printf("\n%d",arr[k]);
}
