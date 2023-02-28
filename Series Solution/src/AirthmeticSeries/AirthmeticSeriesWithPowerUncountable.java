package AirthmeticSeries;

import java.util.Scanner;

public class AirthmeticSeriesWithPowerUncountable {

	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numnber: ");
		int n = 10;
		int x = sc.nextInt();
		
		for(int i = 1, a = 2; i <= n; i++, a+=2) {
			//sum = sum + Math.pow(a, x);
			sum = sum + a * a;
		}
		System.out.println("Sum : "+sum);
	}
}
