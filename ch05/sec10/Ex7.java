package ch05.sec10;

import java.time.temporal.Temporal;

public class Ex7 {

	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int max = 0;
		
		// 최대값을 출력하는 프로그램 완성
		for(int temp : array) { //향상된 for문은 반복 가능한 array객체를 temp변수에 담아서 비교
			if(temp > max) {
				max = temp;
		
			}
		}	
		System.out.println("최대값: " + max);
		
	}

}
