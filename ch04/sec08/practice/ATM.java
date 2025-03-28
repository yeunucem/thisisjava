package ch04.sec08.practice;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		
		int balance = 0; 
		int request = 0;//요청금액
		String temp = ""; //임시저장 숫자
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("choice > ");
			
			// 메뉴선택입력
			temp = sc.nextLine();
			
			//예금
			if("1".equals(temp)) { //temp.equals("1") ~ temp에 값이 없는 경우? | 존재하는 객체에 . 을 써서 사용함
				//잔액balance 변수에 요청값request 누적
				System.out.print("예금액 > ");
				request = Integer.parseInt(sc.nextLine());
				balance += request;
				
			} else if ("2".equals(temp)){//출금
				//잔액 변수에서 요청값 차감
				System.out.print("출금액 > ");
				request = Integer.parseInt(sc.nextLine());
				
				if(balance < request) {//잔액 부족한 경우
					System.out.println("잔액이 부족합니다.");
				} else {//잔액 충분한 경우
					balance -= request;
				}
				
			} else if ("3".equals(temp)){//잔고출력
				System.out.println("잔액 > " + balance);
				
			} else if ("4".equals(temp)){//종료
				break;
			}
			// 입력된 메뉴에 대한 일처리
			// 메뉴에서 필요한 데이터 입력받기
			
		}

	}
}
