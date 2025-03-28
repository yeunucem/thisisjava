package ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "0106244230123";
		char sex = ssn.charAt(6);
		switch (sex) { //switch 문에서 디폴트는 옵션이지 필수가 아님
			case '1':
			case '3': //break가 없어서 case 둘 다 수용
				System.out.println("남자 입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자 입니다.");
				break;
		}
	}
}
