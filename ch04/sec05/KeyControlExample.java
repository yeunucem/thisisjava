package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;		
		int speed = 0;
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.증속 | 2.감속 | 3.중지");
			System.out.println("-----------------------------");
			System.out.print("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {//문자열은 == 이 아닌, equals로 비교해야 한다
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if(strNum.equals("3")) {
				run = false;
			}
		}	
		
		System.out.println("프로그램 종료");
	}
}
//다른 걸 입력해도 프린트가 출력되는 이유? 따로 else 설정을 안 해줬음에도
