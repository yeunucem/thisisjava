package ch04.sec08.practice;

public class Ex5 {

	public static void main(String[] args) {
		
		for(int x=1; x<=10; x++) {
			for(int y = 1; y <=10; y++) {
				
				int total = 4*x + 5*y;
				if(total == 60) {
					System.out.print("( " + x + ", " + y +" )\t" );
					System.out.println("" + total + " ");
				}
			}
		}
	}
}