package ch05.sec06;

import java.util.Scanner;

public class ArrayLengthExample2 {

	public static void main(String[] args) {
		// 배열 변수 선언과 배열 대입
		int[] scores = new int[3];
		System.out.println("총합과 평균을 구할 정수 3가지를 입력하세요");

		Scanner sc = new Scanner(System.in);
		int num = 0;
		for (int i = 0; i < scores.length; i++) {
			num = sc.nextInt();
			scores[i] = num;

		}
		/*
		 * Scanner sc = new Scanner(System.in); //초안 코드 scores[0] = sc.nextInt();
		 * scores[1] = sc.nextInt(); scores[2] = sc.nextInt();
		 */
		// 이런 식이면 갯수가 많을때 처리 곤란

		// 배열 항목의 총합 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);

		// 배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);

	}

}
