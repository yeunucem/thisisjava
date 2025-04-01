package ch06.sec08.exam03;

public class HoBread {

	int price;
	String name;

	HoBread(String name) {
		this.name = name;

		if (name.equals("호떡")) {
			this.price = 700;
		} else if (name.equals("씨앗")) {
			this.price = 900;
		}
	}
}
