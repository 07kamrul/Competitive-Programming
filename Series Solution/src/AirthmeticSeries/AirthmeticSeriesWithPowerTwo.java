package AirthmeticSeries;

import java.util.Scanner;

/*
 *9^2 + 13^2 + 17^2.....N 
 * */

public class AirthmeticSeriesWithPowerTwo {
	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		for(int i = 1, a = 9; i <= n; i++, a+=4) {
			sum = sum + Math.pow(a, 2);
		}
		System.out.println("Sum: "+sum);
	}

}
