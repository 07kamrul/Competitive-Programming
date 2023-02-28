package AirthmeticSeries;
import java.util.Scanner;
/*
 * 1 + 2 + 3 + 4.....N 
 * */

public class AirthmeticSeriesIncreaseByOne {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		for(int i = 1, a = 1; i <= n; i++, a++) {
			sum = sum + a;
		}
		System.out.println("Sum: "+sum);
	}

}
