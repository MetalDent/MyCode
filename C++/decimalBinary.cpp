/******************** decimal to binary and vice-versa *********************/

#include<iostream>
#include<math.h>
using namespace std;

void decToBin(int n) {

	int i = 0, binNum[32];

	if(n == 0)		// corner case
		cout << "0";

	while(n > 0) {

		binNum[i] = n%2;
		n /= 2;
		i++;
	}

	for(int j = i-1 ; j >=0 ; j--)
		cout << binNum[j];

	cout << endl;
}

void binToDec(int n) {

	int i = 0, decNum[32], num = 0;

	while(n > 0) {

		decNum[i] = (n%10)*pow(2, i);
		n /= 10;
		i++;
	}

	for(int j = i-1 ; j >=0 ; j--)
		num += decNum[j];

	cout << num << endl;
}

int main()
{
	int n, ch;

	cout << "1. Decimal to binary \n2. Binary to decimal\n";
	cin >> ch;

	cout << "Enter n: ";
	cin >> n;

	switch(ch) {

		case 1: decToBin(n);
				break;

		case 2: binToDec(n);
				break;

		default: cout << "Wrong choice!";
	}

	return 0;
}