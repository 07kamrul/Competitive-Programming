package AirthmeticSeries;

import java.util.Scanner;

/*
 10+9+8+7....1
 * */

public class AirthmeticSeriesDecreaseByOne {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		for(int i = 1, a = 10; i <= n; i++, a--) {
			sum = sum + a;
		}
		System.out.println("Sum: "+sum);
	}
}
