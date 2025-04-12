package ch04.sec08.practice;

//import javax.sql.RowSetListener;

public class Problem05 {

	public static void main(String[] args) {
//		//#1 규칙
//		for (int i=1; i <= 10; i++) { // 1
//			for (int j=1; j<=10 ; j++) { // 1;1; | 2 
//				System.out.print((j+i-1) + "\t");
//			}
//			System.out.println();
//		}
//		
//		
//		//#2 행|열 처리
//		int rows = 10;
//		int columns = 10;
//		
//		for (int i=1; i<=rows; i++) {
//			for (int j=1; j<i+columns; j++) {
//				System.out.print(j + "\t");
//			}
//			System.out.println();
//		}
	
		//#3
		for (int i=0; i<=9; i++) {
			for (int j=1+i; j<=10+i ; j++) {
				System.out.print(j + "\t");
			}
			System.out.print("\n");
		}
	}
}
