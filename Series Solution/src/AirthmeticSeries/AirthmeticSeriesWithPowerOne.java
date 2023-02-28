package AirthmeticSeries;

import java.util.Scanner;

public class AirthmeticSeriesWithPowerOne {

	/*
	 * x1 + x2 + x3 ... N 
	 * */
	
	public static void main(String[] args) {
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i = 1, a = 1; i<= n; i++, a++)
		{
			sum = sum + Math.pow(x, a);
		}
		System.out.println("Sum: "+sum);
	}
}
