package edu201909.day1;

public class Demo1 {

	// ctrl + s 保存
	// 联想 ctrl+space
	// 格式化 ctrl+f
	// 删除一行 ctrl+d
	public static void main(String[] args) {// 方法、函数
		// printAge();
		pritnSum(0, 100);

		// 测试 输出结果 011223
		System.out.println(roomCount(0, 4));
		System.out.println(roomCount(1, 4));
		System.out.println(roomCount(4, 4));
		System.out.println(roomCount(5, 4));
		System.out.println(roomCount(8, 4));
		System.out.println(roomCount(9, 4));
	}

	private static int roomCount(int num) {
		// 酒店4人间，计算需要几间房，来1-4名客人，1间房，5-8名2间房，9名3间房
		// 除/ 和% 0123 4567 %4 == 0
		return (num + 3) / 4;
	}

	// 重载
	private static int roomCount(int num, int c) {
		return (num + c - 1) / c;
	}

	private static void pritnSum(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0)
				sum = sum + i;
		}
		System.out.println(sum);
	}

	private static void printAge() {
		int age = 10;
		if (isAdult(age)) {
			System.out.println("成年了");
		} else {
			System.out.println("未成年");
		}
	}

	public static boolean isAdult(int age) {
		if (age > 18)
			return true;

		return false;
	}

	public static boolean isAdult_v2(int age) {
		return age > 18 ? true : false;
	}
	
}
