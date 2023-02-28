package GeometricSerices;

import java.util.Scanner;

/*
 * x/2 + x/4 + x/8 + x/16 .... N
 * */

public class NumeratorDenominatorGeometric {

	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println("Enter up number : ");
		int x = sc.nextInt();
		System.out.println("Enter down number start from : ");
		int k = sc.nextInt();
		
		for(int i = 1; i <= n; i++, k*=2) {
			sum = sum + (double) x / k;
		}
		System.out.println("Sum : "+sum);
	}
}
