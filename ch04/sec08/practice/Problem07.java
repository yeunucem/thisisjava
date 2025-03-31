package ch04.sec08.practice;

import java.util.Random;
import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Random random = new Random();

		System.out.println("===========================");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("===========================");

			boolean playAgain = true;

			while(playAgain) {
				int targetNumber = random.nextInt(100) + 1; //1~100사이 난수 발생
				int guess = 0;

				while (true) {
					System.out.print(">> ");
					guess = scanner.nextInt();

					if (guess > targetNumber) {
						System.out.println("더 낮게");
					} else if (guess < targetNumber) {
						System.out.println("더 높게");
					} else {
						System.out.println("맞았습니다");
						break;
					}
				}

				System.out.println("게임을 종료하시겠습니까? (y/n) >> ");
				char response = scanner.next().charAt(0);
				playAgain = (response == 'n' || response == 'N');

				System.out.println("===========================");
				System.out.println("   [숫자맞추기게임 종료]   ");
				System.out.println("===========================");
				scanner.close();
			}
	}
}
