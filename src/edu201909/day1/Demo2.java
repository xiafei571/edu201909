package edu201909.day1;

public class Demo2 {

	public static void main(String[] args) {
		// printTriangle(3);
		// printTriangle(5);
		// testAddAdd();
		String s = null;// "abc"+123+456+"cba";
		System.out.println(s);

		// StringBuffer 线程安全的
		StringBuilder sb = new StringBuilder("abc");
		sb.append(123).append(456).append("cba");
		System.out.println(sb);

		int aaa = 10;
		int bbb = 20;

		System.out.println(aaa == bbb);
		if (null != s) {
			System.out.println(s.equals(sb.toString()));
		}
	}

	private static void testAddAdd() {
		int a = 5;
		int b = a++; // 1.因为++在后面，所以先赋值再运算，b=a=5之后再a++ (a=a+1) a=6;
		int c = ++a; // 2.先运算再赋值 a=7 再赋值给c c=7

		System.out.println(b);
		System.out.println(c);
	}

	private static void printTriangle(int n) {
		/*
		 * 输入3
		 * 
		 * *****
		 *  ***
		 *   *
		 * 
		 * 输入5 星 空格 ********* 9 0 ******* 7 1 ***** 5 2 *** 3 3 * 1 4
		 * 
		 */

		for (int i = n - 1; i >= 0; i--) {
			// i:4 3 2 1 0
			// *:9 7 5 3 1
			// * = 2*i + 1
			// k:0 1 2 3 4
			for (int k = 0; k < n - 1 - i; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
