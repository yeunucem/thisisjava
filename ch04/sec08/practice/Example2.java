package ch04.sec08.practice; //표현식?

public class Example2 {
  public static void main(String[] args) throws Exception {
    String grade = "B";//그레이드에 따라 점수가 출력
    int score1 = 0;
    
    switch (grade) {
	    case "A" -> {
	        score1 = 100;
	    }
	    
	    case "B"-> {
	        int result = 100 - 20;
	        score1 = result;
	    }
	
	    default -> {
	        score1 = 60;
	    }
    }
    System.out.println("점수는: " + score1 + " 등급은: " + grade + " 입니다.");
  }
}

//
//		switch(grade) {
//			case 'A', 'a' -> {
//				System.out.println("우수 회원입니다.");
//			}
//			case 'B', 'b' -> {
//				System.out.println("일반 회원입니다.");
//			}						
//			default -> {
//				System.out.println("손님입니다.");
//			}
//		}
//
//		switch(grade) {
//			case 'A', 'a' -> System.out.println("우수 회원입니다.");
//			case 'B', 'b' -> System.out.println("일반 회원입니다.");						
//			default -> System.out.println("손님입니다.");
//		}
//	}
//}
