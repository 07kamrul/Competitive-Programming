package AirthmeticSeries;

import java.util.Scanner;

/*
 * 2/10 + 4/9 + 6/8 + 8/7 .... 20/1
 * */

public class DecimalAirthmeticSeries {

	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		for(int i = 1, a = 2, d = 10 ; i <= n ; i++, a+=2, d--) {
			sum = sum + (double) a/d;
		}
		System.out.println("Sum : "+sum);
	}
}
