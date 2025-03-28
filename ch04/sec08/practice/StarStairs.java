package ch04.sec08.practice;

public class StarStairs {

	public static void main(String[] args) {
		
		for (int i=1; i <= 10; i++) {
//			System.out.println(i);
			for (int j=1; j<=i; j++) {
				//opt
//				System.out.print("*" + " "); //* 로 계단 만들기
				System.out.print(j + " "); //숫자로 계단 만들기
			}
			System.out.print("\n");
		}
	}
}
