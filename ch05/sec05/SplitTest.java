package ch05.sec05;

public class SplitTest {

	public static void main(String[] args) {

		String board = "번호,제목,내용,글쓴이";

		// 문자열 분리
		String[] arr = board.split(",");

		// 인덱스별로 읽기
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("arr[1]: " + arr[1]);
		System.out.println("arr[2]: " + arr[2]);
		System.out.println("arr[3]: " + arr[3]);
		// System.out.println("arr[4]: " + arr[4]); //outofbounds
		System.out.println();

		// for문을 이용한 읽기 (배열을 이용하려면 for문)
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
        // 객체 내 글자 추출하는 방법은 arr 내 charAt로 찾으면 됨.
		// System.out.println("arr[2].charAt(0): " + arr[2].charAt(0));

	}

}
