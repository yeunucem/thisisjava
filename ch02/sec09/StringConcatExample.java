package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		//숫자 연산
		int result1 = 10 + 2 + 8;
		String result1_1 = 10 + 2 + 8 + ""; //String.valueOf()
		System.out.println("result1: " + result1);
		System.out.println("result1_1: " + result1_1);
		
		//결합 연산
		String result2 = 10 + 2 + "8"; //10과 2를 더한, 12를 문자열로 취급하여 합침
		System.out.println("result2: " + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3);
		
		String result4 = "10" + 2 + 8; //1028
		System.out.println("result4: " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("result5: " + result5);
		
		String a = "Hello, ";
		String b = "Java";
		System.out.print(a);
		System.out.println(b);
		
		//10 + 10 = 20
		String str = "10";
		byte number = Byte.parseByte(str);
		System.out.println(number + number);
	}
}

/*
 String result4 = "10" + 2 + 8;
여기서 "10"은 문자열이고, + 연산자가 문자열과 숫자(2와 8) 사이에서 사용됩니다.
Java에서 문자열과 숫자를 +로 연결하면 숫자가 문자열로 변환되어 **문자열 연결(concatenation)**이 이루어집니다.
연산은 왼쪽에서 오른쪽으로 진행됩니다:
"10" + 2 → "102" (문자열 "10"에 숫자 2가 문자열로 추가됨)
"102" + 8 → "1028" (문자열 "102"에 숫자 8이 문자열로 추가됨)
결과: result4는 "1028"라는 문자열이 됩니다.
출력: result4: 1028
String result5 = "10" + (2 + 8);
여기서는 괄호 (2 + 8)가 먼저 계산됩니다.
괄호 안의 2 + 8은 숫자 연산으로, 결과는 10 (정수)입니다.
그 다음 "10" + 10이 수행됩니다:
문자열 "10"과 숫자 10을 +로 연결하면 숫자가 문자열로 변환되어 문자열 연결이 이루어집니다.
"10" + 10 → "1010"
결과: result5는 "1010"이라는 문자열이 됩니다.
출력: result5: 1010
차이점 요약
result4: 괄호가 없으므로 문자열 "10"에 숫자 2와 8이 순서대로 연결되어 "1028"이 됩니다.
result5: 괄호 (2 + 8)가 먼저 계산되어 10이 되고, 그 결과가 문자열 "10"에 연결되어 "1010"이 됩니다.
핵심 차이: 괄호의 유무로 인해 연산 우선순위가 달라졌고, 결과적으로 result4는 "1028", result5는 "1010"이라는 서로 다른 문자열이 생성됩니다.
 */
