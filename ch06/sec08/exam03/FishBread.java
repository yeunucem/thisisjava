package ch06.sec08.exam03;

public class FishBread {
	// 팥붕(700), 슈붕(1000), 호떡(700), 씨앗호떡(900) 만족 클래스 완성
	// 메인 클래스 (가게 운영 프로그램)는 각 객체를 생성시에 원하는 종류와 가격을 세팅하고 생성하도록 변경
	// 가게 운영 프로그램은 손님이 원하는 빵 종류와 갯수만 알려주면 전체 받아야 할 가격을 계산하는 프로그램으로 완성하시오.
	
	int price=700;
	String name;

	FishBread(String name) {
		this.name = name;
	}
	
	FishBread(String name, int price) {
		this.name = name;
		this.price =price;
		
		}

	}


