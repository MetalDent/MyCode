/****************** Find the prime numbers smaller than or equal to n ******************/

#include<iostream>
using namespace std;

bool checkPrime(int n)
{
	if(n <= 1)
		return false;

	for(int i = 2 ; i < n ; i++) {

		if(n%i == 0)
			return false;
	}

	return true;
}

int main()
{
	int n;
	cout << "Enter n: ";
	cin >> n;

	for(int i = 2 ; i <= n ; i++) {

		if(checkPrime(i))
			cout << i << "\n";
	}

	return 0;
}