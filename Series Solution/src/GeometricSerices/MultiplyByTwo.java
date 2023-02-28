package GeometricSerices;

import java.util.Scanner;

/*
 * 2 + 4 + 8 + 16.....N 
 * */

public class MultiplyByTwo {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		for(int i = 1, k = 2 ; i <= n ; i++, k*=2) {
			sum = sum + k;
		}
		System.out.println("Sum: "+sum);
	}
}
