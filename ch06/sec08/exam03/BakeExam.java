package ch06.sec08.exam03;

public class BakeExam {

	public static void main(String[] args) {
		// 팥붕 2개 슈붕 2개 만들기
		FishBread[] fb = new FishBread[4];

		for (int i = 0; i < 2; i++) {
			fb[i] = new FishBread("팥붕");
		}
		for (int i = 2; i < 4; i++) {
			fb[i] = new FishBread("슈붕");
		}

		int fbPrice = 0;
		for (int i = 0; i < fb.length; i++) {
			System.out.println(fb[i].name + " " + fb[i].price);
			fbPrice += fb[i].price;
		}

		HoBread[] hb = new HoBread[4];

		for (int j = 0; j < 2; j++) {
			hb[j] = new HoBread("호떡");
		}
		for (int j = 2; j < 4; j++) {
			hb[j] = new HoBread("씨앗");
		}

		int hbPrice = 0;
		for (int i = 0; i < hb.length; i++) {
			System.out.println(hb[i].name + " " + hb[i].price);
			hbPrice += hb[i].price;
		}
		System.out.println("총 금액: " + (hbPrice + fbPrice));
	}

}