package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		Car myCar3 = new Car();
		myCar3.brand = "Kia";
		System.out.println(myCar3.brand);
		
		Car myCar2 = new Car();
		myCar2.speed = 160;
		System.out.println("myCar2 현재속도: " + myCar2.speed);
		
		//Car 객체의 필드 값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("myCar 현재속도: " + myCar.speed);
	}
	
	
}

