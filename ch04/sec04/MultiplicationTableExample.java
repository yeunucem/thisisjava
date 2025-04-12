package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int m = 2; m <= 9; m++) {
            System.out.print("*** " + m + "단 ***\t");
        }
        System.out.println(); // 단 제목 이후 줄바꿈

        for (int n = 1; n <= 9; n++) {
            for (int m = 2; m <= 9; m++) {
                System.out.print(m + " x " + n + " = " + (m * n) + "\t");
            }
            System.out.println(); // 각 곱셈 결과의 한 줄을 출력한 뒤 줄바꿈
        }
    }
}

/*
public class GugudanEx2 {
	public static void main(String[] args) {
		for (int i=0;i<=9;i++) {
			for (int j=2;j<=9;j++) {
				//System.out.print(j+" x "+i+" = "+(i*j)+"\t");
				if (i==0) {
					System.out.printf("***%d 단***\t",j);
				}else {
				System.out.printf("%d x %d = %d\t",j,i,(i*j));
				}
			}
			System.out.println();
		}
	}
}
*/


//public class MultiplicationTableExample {
//    public static void main(String[] args) {
//        for (int m = 2; m <= 9; m++) {
//            System.out.print("*** " + m + "단 ***\t");
//        }
//        System.out.println(); // 단 제목 이후 줄바꿈
//
//        for (int n = 1; n <= 9; n++) {
//            for (int m = 2; m <= 9; m++) {
//                System.out.print(m + " x " + n + " = " + (m * n) + "\t");
//            }
//            System.out.println(); // 각 곱셈 결과의 한 줄을 출력한 뒤 줄바꿈
//        }
//    }
//}
