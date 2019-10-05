package edu201909.day1;

public class Demo4 {

	public static void main(String[] args) {

		ten2Sixteen(10);
		ten2Sixteen(20);

	}

	private static void ten2Binary(int n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n = n / 2;
		}
		System.out.println(sb.reverse());
	}

	private static void ten2Eight(int n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 8);
			n = n / 8;
		}
		System.out.println(sb.reverse());
	}

	static char c[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	private static void ten2Sixteen(int n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(c[n % 16]);
			n = n / 16;
		}
		System.out.println(sb.reverse());
	}

}
