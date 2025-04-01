package ch06.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250);
		//Car myCar = new Car();  //기본 생성자 호출 못함
		//String, String, Int가 시그니쳐
		
		Car myCar2 = new Car("검정", "소나타", 250);
		
		Car myCar3 = new Car("그랜져", 50, "검정");
		
	}
}

