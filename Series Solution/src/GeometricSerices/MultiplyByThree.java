package GeometricSerices;

import java.util.Scanner;

public class MultiplyByThree {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println("Start from : ");
		int k = sc.nextInt();
		
		for(int i = 1; i <= n; i++, k*=3) {
			sum = sum + k;
		}
		System.out.println("Sum: "+sum);
	}
}
