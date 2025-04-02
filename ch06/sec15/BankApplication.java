package ch06.sec15;

import java.awt.font.TextHitInfo;
import java.util.Scanner;

public class BankApplication {

	private static Account[] accountarray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int index = 0;
		boolean run = true;
		while (run) {
			// 첫 실행 시 출력 목록
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");

			int selectNum = Integer.parseInt(scanner.nextLine());
			if (selectNum == 1) {

				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");

				System.out.print("계좌번호: ");
				String num = scanner.nextLine();
				System.out.print("계좌주: ");
				String name = scanner.nextLine();
				System.out.print("초기입금액: ");
				int balance = Integer.parseInt(scanner.nextLine());

				accountarray[index] = new Account(num, name, balance);
				index++;
				System.out.println("결과: 계좌가 생성되었습니다. ");
			}

			else if (selectNum == 2) {

				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");

				for (int i = 0; i < index; i++) {
					System.out.println(accountarray[i].getNum() + " " + accountarray[i].getName() + " "
							+ accountarray[i].getBalance());
				}
			} else if (selectNum == 3) {

				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");

				System.out.print("계좌번호: ");
				String num = scanner.nextLine();
				System.out.print("예금액: ");
				int balance2 = Integer.parseInt(scanner.nextLine());

				for (int i = 0; i < index; i++) {

					if (accountarray[i].getNum().equals(num)) {
						accountarray[i].setBalance(balance2);
					}
				}
			}

			else if (selectNum == 4) {

				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");

				System.out.print("계좌번호: ");
				String num = scanner.nextLine();
				System.out.print("출금액: ");
				int balance1 = Integer.parseInt(scanner.nextLine());
				
				for (int i = 0; i < index; i++) {

					if (accountarray[i].getNum().equals(num)) {
						accountarray[i].setBalance1(balance1);
					}
				}				
				System.out.println("결과: 출금이 성공되었습니다.");

			} else if (selectNum == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
}
