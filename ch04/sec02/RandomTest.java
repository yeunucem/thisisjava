package ch04.sec02;

public class RandomTest {

	public static void main(String[] args) {
		int d = (int) (Math.random() * 45) + 1;
//		int d = (int) Math.random() * 6; //난수: 0
		
		System.out.println("난수: " + d);

	}

}
