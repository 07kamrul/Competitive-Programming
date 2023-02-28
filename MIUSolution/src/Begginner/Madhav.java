package Begginner;

public class Madhav {

	public static void main(String[] args) {
		int result = isMadhavArray(new int[]{2, 1, 1});
		System.out.println(result);
		result = isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
		System.out.println(result);
		result = isMadhavArray(new int[]{18, 9, 10, 6, 6, 6});
		System.out.println(result);
		result = isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4});
		System.out.println(result);
		result = isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{3, 1, 2, 3, 0});
		System.out.println(result);
	}
	
	 public static int isMadhavArray(int[] a) {
		 int isMadhavArray = 0;
		 int startIndex = 0;
		 int endIndex = 0;
		 int n = 1;
		 int currentSum =0;
		 int sum = 0;
		 int currentLengthOfArray = 1;
		 int calculatedLengthOfArray = 1;
		 
		 while(currentLengthOfArray <= a.length) {
			 if(currentLengthOfArray == calculatedLengthOfArray) {
				 for(int index = startIndex; index <= endIndex; index++) {
					 currentSum += a[index];
				 }
			 }
			 else {
				 isMadhavArray = 0;
				 break;
			 }
			 
			 if((currentSum == sum) || (startIndex == endIndex)) {
				 sum = currentSum;
				 currentSum = 0;
				 isMadhavArray = 1;
			 }
			 else {
				 isMadhavArray = 0;
				 break;
			 }
			 
			 if(currentLengthOfArray == a.length) {
				 break;
			 }
			 else {
				 startIndex = endIndex + 1;
				 endIndex = startIndex + n;
				 if((startIndex < a.length) && (endIndex < a.length)) {
					 n++;
				 }
				 else {
					 endIndex = a.length - 1;
					 n = endIndex - startIndex;
				 }
				 calculatedLengthOfArray = n * (n + 1) / 2;
				 currentLengthOfArray = endIndex + 1;
			 }
		 }
		 return isMadhavArray;
	 }
}
