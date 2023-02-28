package AirthmeticSeries;

import java.util.Scanner;

/*
 * 2 + 4 + 6 + 8...N
 * */
public class AirthmeticSeriesIncreaseByTwo {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		for( int i = 1, a = 2; i <= n; i++, a += 2) {
			sum = sum + a;
		}
		System.out.println("Sum : "+sum);
	}

}
