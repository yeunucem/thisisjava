package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		//int[] intArray = null;
		int[] intArray = new int[10];
		//sintArray[0] = 10;	 //NullPointerException
		
		

		String str = null; //null을 ""로 묶으면 가동됨
		//System.out.println("총 문자수: " + str.length() );	  //NullPointerException
	}
}



