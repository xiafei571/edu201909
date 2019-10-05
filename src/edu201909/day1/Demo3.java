package edu201909.day1;

public class Demo3 {

	public static void main(String[] args) {
		// 数组
		int[] array = { 23, 15, 7, 1, 4, 2 };
		
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();

//		for (int i = array.length - 1; i >= 0; i--) {
//			System.out.println(array[i]);
//		}
		// 数组 链表
		// 0xaf0036 6 int[] array = { 23, 15, 7, 1, 4, 2 };
		System.out.println("最大值：" + getMax(array));
		System.out.println("最小值：" + getMin(array));
	}

	private static int getMax(int[] array) {
		int max = array[0];
		// TODO
		return max;
	}

	private static int getMin(int[] array) {
		return 0;
	}
	
	
}
