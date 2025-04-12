package ch04.sec08.practice;

public class Problem01 {

	public static void main(String[] args) {
		//1-100 정수에서 5배수 7배수를 동시 만족 시키는 수 출력
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}
