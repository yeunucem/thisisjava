package ch05.sec10;

import java.time.temporal.Temporal;

import jdk.vm.ci.hotspot.HotSpotCompilationRequestResult;

public class Ex8 {

	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 }

		};

		int tot = 0;
		double totsum = 0;

		for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i].length); 2개, 3개, 5개 출력하는 값
			for (int j = 0; j < array[i].length; j++) {
				tot += array[i][j];
				//System.out.println("tot = " +tot); 누적되는 값 구하기
				totsum++;
				//System.out.println("totsum = " +totsum); 점수 갯수 누적되는 값 구하기
			}
		}
		System.out.println("총합 : " + tot);
		System.out.println("평균 : " + tot/totsum);
	}

}
