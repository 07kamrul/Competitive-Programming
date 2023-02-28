package AirthmeticSeries;

import java.util.Scanner;
/*
 * 1^3/X + 3^3/X + 5^3/X .....N 
 * */

public class DecimalAirthmeticSeriesWithPowerThree {

	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i = 1, a = 1; i <= n; i++, a+=2) {
			sum = sum + (double)a * a * a / x;
		}
		System.out.println("Sum : "+sum);
	}

}
