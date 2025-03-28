package ch04.sec08.practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		
		//while
		int max = 0;
		int temp = 0;
		int count = 1;
		Scanner sc = new Scanner(System.in); //sc(Scanner 클래스의 인스턴스를 참조하는 변수) 객체의 타입은 Scanner
		
		while (true) {
			System.out.println("숫자 입력");
			temp = sc.nextInt(); //표준 입력으로부터 정수를 읽음 | nextInt()가 해당 값을 정수로 반환
			
			if (max < temp) {
				max = temp;
				System.out.println("숫자: " + max);
			}
			if (count == 5) {
				System.out.println("exit");
				break;
			}
			count++;
		}
		
//////////////////////////////////////////////////////////////////////

		//for
//		int max = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("input a Num >>>");
//		for (int i=0; i<5; i++) {
//			System.out.print("num: ");
//			int n = sc.nextInt(); // Integer.parseInt(sc.nextLine());
//			if (n > max) {
//				max = n;
//			}
//		}
//		System.out.printf("the maximum is %d.", max);
		
	}
}
