/*********************************** KnapSack Problem **************************************/

#include<iostream>
using namespace std;

int max_no(int x, int y)
{
	int max = x;

	if(y > x)
		max = y;

	return max;
}

int knapsack(int max_wt, int wt[], int val[], int n)
{
	if(n == 0 || max_wt == 0)
		return 0;

	else if(wt[n-1] > max_wt)
		return knapsack(max_wt, wt, val, n-1);

	else 
		return max_no( val[n-1] + knapsack(max_wt-wt[n-1], wt, val, n-1), knapsack(max_wt, wt, val, n-1) );

}

int main()
{
	int wt[3], val[3], max_wt = 50, n = 3;

	cout<<"Enter weights: "<<endl;
	for(int i = 0 ; i < 3 ; i++)
		cin>>wt[i];

	cout<<"Enter values: "<<endl;
	for(int i = 0 ; i < 3 ; i++)
		cin>>val[i];

	cout<<knapsack(max_wt, wt, val, n)<<endl;

	return 0;
}

