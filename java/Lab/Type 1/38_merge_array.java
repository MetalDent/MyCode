
class merge_array { 
	void moveToEnd(int mPlusN[], int size) { 
		int i, j = size - 1; 
		for (i = size - 1; i >= 0; i--) { 
			if (mPlusN[i] != -1) 
			{ 
				mPlusN[j] = mPlusN[i]; 
				j--; 
			} 
		} 
	} 

	void merge(int mPlusN[], int N[], int m, int n) { 
		int i = n; 
		
		int j = 0; 
		
		int k = 0; 
		
		while (k < (m + n)) { 
			if ((i < (m + n) && mPlusN[i] <= N[j]) || (j == n)) { 
				mPlusN[k] = mPlusN[i]; 
				k++; 
				i++; 
			} 
			
			else {
				mPlusN[k] = N[j]; 
				k++; 
				j++; 
			} 
		} 
	} 

	void printArray(int arr[], int size) 
	{ 
		int i; 
		for(i = 0; i < size; i++) 
			System.out.print(arr[i] + " "); 

		System.out.println(""); 
	} 

	public static void main(String[] args) 
	{ 
		merge_array obj = new merge_array(); 
		
		int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20}; 
		int N[] = {5, 7, 9, 25}; 
		int n = N.length; 
		int m = mPlusN.length - n; 

		obj.moveToEnd(mPlusN, m + n); 

		obj.merge(mPlusN, N, m, n); 

		obj.printArray(mPlusN, m + n); 
	} 
} 

