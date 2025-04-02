package ch06.sec08.exam03;

public class BakeExam {

	public static void main(String[] args) {
		// 팥붕 3개 슈붕 4개 호떡 2개 씨앗 4개
		// 붕 전체 7개
		FishBread[] fb = new FishBread[7];
		// 호 전체 6개
		HoBread[] hb = new HoBread[6];

		for (int i = 0; i < 3; i++) {
			fb[i] = new FishBread("팥붕", 700);
		}
		for (int i = 3; i < 7; i++) {
			fb[i] = new FishBread("슈붕", 1000);
		}

		int fbPrice = 0;
		for (int i = 0; i < fb.length; i++) {
			fbPrice += fb[i].price;
		}

		for (int j = 0; j < 2; j++) {
			hb[j] = new HoBread("호떡", 700);
		}
		for (int j = 2; j < 6; j++) {
			hb[j] = new HoBread("씨앗", 1000);
		}

		int hbPrice = 0;
		for (int i = 0; i < hb.length; i++) {
			hbPrice += hb[i].price;
		}
		
		int total = fbPrice + hbPrice;
		
		System.out.println("총 금액: " + total);
	}

}