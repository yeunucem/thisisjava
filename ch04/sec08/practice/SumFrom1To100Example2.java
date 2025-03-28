package ch04.sec08.practice; //1~100 사이 3배수의 합?

public class SumFrom1To100Example2 {
	public static void main(String[] args) {
		int sum = 0; 
		int i;
		
		for(i=1; i<=100; i++) {
			
			if(i%3 == 0) { //3의 배수일 경우에만,
				sum += i; //누적
			}
		}
		
		System.out.println("1~" + (i-1) + "3의 배수 총합 : " + sum);
	}
}

