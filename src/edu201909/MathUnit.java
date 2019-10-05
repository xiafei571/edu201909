package edu201909;

public class MathUnit {

	public static String ten2Binary(int n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n = n / 2;
		}
		return sb.reverse().toString();
	}

}
