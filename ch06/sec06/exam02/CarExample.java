package ch06.sec06.exam02;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		//스트링타입은 값지정없이 new로 초기호하면 null나옴
		//Car 객체의 필드 값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//Car 객체의 필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}
}

