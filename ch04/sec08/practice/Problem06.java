package ch04.sec08.practice;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		
		//#1
		int Number;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a Number: ");
		Number = sc.nextInt();
		
		if (Number%2 == 1) {
			for (int i=1; i<=Number; i+=2) {
				result += i;
			} 
		} else { //if (Number%2 == 0)
			for (int i=2; i<=Number; i+=2) {
				result += i;
			} 
		}
		System.out.println("result: " + result);
		sc.close();
		
		//#1_a
		
		
		//#2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("A Num please: ");
//		int n = sc.nextInt();
//		int sum = 0;
//		int oddOrEven = n%2; // 0 or 1
//		for (int i=oddOrEven; i<=n; i+=2) {
//			sum+=i;
//		}
//		System.out.printf("result: %d", sum);
	}
}
