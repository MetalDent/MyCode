//idk wtf this is but I got it from where the question's been copied. Error to error.

import java.util.Scanner;
public class pentagonalNos{
public static void main(String[] args) {
   		int count = 1;
		for(int i = 1; i <= 50; i++){
			System.out.printf("%-6d",getPentagonalNumber(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
  public static int getPentagonalNumber(int i) {
		return (i * (3 * i - 1))/2;
	}
}