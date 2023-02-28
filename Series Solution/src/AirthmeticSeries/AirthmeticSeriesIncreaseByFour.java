package AirthmeticSeries;

import java.util.Scanner;

/*
 * 9 + 13 + 17.....N 
 * */

public class AirthmeticSeriesIncreaseByFour {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		for(int i = 1, a = 9; i <= n; i++, a+=4) {
			sum = sum + a;
		}
		System.out.println("Sum: "+sum);
	}

}
