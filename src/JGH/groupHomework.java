package JGH;
import java.util.Scanner;
public class groupHomework {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		// TASK 1 Create an array on int values using a scanner and calculate the sum of all stored elements in that array.
		
//		System.out.println("Please enter Array's length: ");
//		int k = sc.nextInt();
//		int i = 0;
//		int sum = 0;
//		int[] nums = new int [k+1];
//	
//		for (i = 0; i < k; i++) {
//			
//		System.out.println("Input number: ");
//		nums[i] = sc.nextInt();
//		sum = sum + nums[i];
//		}
//		
//		System.out.print("The sum of array is: " + sum);
		
		// TASK 2 Create a 2D array of integer values. Print the sum of all numbers.
		
//		int[][] arr = {{55, 43, 23, 51, 68, 53, 31, 56, 21}, {56, 12, 53, 53, 12, 53, 12, 67, 88}};
//		int sum = 0;
//		System.out.println("2D array arr: ");
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//				sum = sum + arr[i][j];
//			}
//			System.out.println();
//		}
//		System.out.println("The sum of array is: " + sum);
		
		// TASK 3 Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.
		
//		int[][] arr = {{55, 43, 23, 51, 68, 53, 31, 56, 21}, {56, 12, 53, 53, 12, 53, 12, 67, 88}};
//		
//		System.out.println("2D array arr, even numbers only: ");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (arr[i][j] %2 == 0) {
//					System.out.print(arr[i][j] + " ");
//				}	
//			}		
//		}
		
		// TASK 4 Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
		
//		int[][] arr = {{55, 43, 23, 51, 68, 53, 31, 56, 21}, {56, 12, 53, 53, 12, 53, 12, 67, 88}};
//		int sumEven = 0;
//		int sumOdd = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (arr[i][j] %2 == 0) {
//					sumEven = sumEven + arr[i][j];
//				}
//				else {
//					sumOdd = sumOdd + arr[i][j];
//				}
//			}
//				System.out.println();
//			}
//		System.out.println("Sum of even numbers: " + sumEven);
//		System.out.println("Sum of odd numbers: " + sumOdd);	
		
		// TASK 5 Write a program to swap 2 numbers without a temporary variable?
		
//		System.out.println("Input first number: ");
//		int a = sc.nextInt();
//		System.out.println("Input second number: ");
//		int b = sc.nextInt();
//		
//		System.out.println("First number: " + a);
//		System.out.println("Second number: " + b);
//		
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		
//		System.out.println("First number after swap: " + a);
//		System.out.println("Second number after swap: " + b);
		
		// TASK 6 Write a java program to check whether a given number is prime or not?
//		
//		System.out.println("Enter number from 1 to 10 000 000");
//		int a = sc.nextInt();		
//		boolean prime = false;
//		
//		for (int i = 2; i < a; i++) {
//			if (a%i == 0){
//				prime = true;
//				break;	
//			}
//			}
//		
//		if (!prime) {
//			System.out.println(a + " is a prime number");
//		}
//		else {
//			System.out.println(a +" is NOT a prime number");
//		}
		
		// TASK 7 Write a Java Program to print the first 10 numbers of Fibonacci series.
		
//		System.out.println("First 10 numbers of Fibonacci series: ");
//
//		int j = 1; // 1
//		int k = 0; // 1
//		int l = 0; // 1
//		
//		System.out.println(k + " ");
//		System.out.println(j + " ");
//		
//		for (int i = 0; i < 7; i++ ){
//			
//			l = j + k;
//			k = j;
//			j = l;
//	
//			System.out.println(j + " ");
//		}
		
		// TASK 8 Maximum and minimum number in the array?
		
//		int[][] arr = {{55, 43, 23, 51, 68, 53, 31, 56, 21}, {56, 12, 53, 53, 12, 53, 12, 67, 88}};
//		int maxNum = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if(arr[i][j] > maxNum) {
//					maxNum = arr[i][j];
//				}
//			}
//			System.out.println();
//		}
//		
//		System.out.println("Max number of given array is: " + maxNum);
//		
		
		// TASK 9 Write a java program to find the second largest number in the array?
		
//		int[][] arr = {{55, 43, 23, 51, 68, 53, 31, 56, 21}, {56, 12, 53, 53, 12, 53, 12, 67, 88}};
//		int maxNum = 0;
//		int maxNum2 = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if(maxNum < arr[i][j]) {
//					maxNum2 = maxNum;
//					maxNum = arr[i][j];
//				}
//				else if (maxNum2 < arr[i][j]) {
//					maxNum2 = arr[i][j];
//				}
//				
//				
//				
//			}
//			
//			System.out.println();
//		}
//		
//		System.out.println("2nd Max number of given array is: " + maxNum2);
	}

}
