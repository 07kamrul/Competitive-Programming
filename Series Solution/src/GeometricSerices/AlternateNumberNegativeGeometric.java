package GeometricSerices;

import java.util.Scanner;

/*
 * 2 - 6 + 18 - 54 .... N
 * */

public class AlternateNumberNegativeGeometric {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println("Enter start from : ");
		int k = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++, k*=3) {
			if(i % 2 == 0) {
				sum = sum - k;						
			}
			else {
				sum = sum + k;
			}
		}
		System.out.println("Sum : "+sum);
	}
}
