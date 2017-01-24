package specialNumber;

public class Solution {
	public static void main(String[] args) {
		for (int i = 1000; i <= 9999; i++) {
			if (sumOfTen(i) == sumOfTwelve(i) && sumOfTen(i) == sumOfSixteen(i)) {
				System.out.println(i);
			}
		}
	}

	public static int sumOfTen(int num) {
		if (num < 10) {
			return num;
		}
		return num % 10 + sumOfTen(num / 10);
	}

	public static int sumOfTwelve(int num) {
		if (num < 12) {
			return num;
		}
		return num % 12 + sumOfTwelve(num / 12);
	}

	public static int sumOfSixteen(int num) {
		if (num < 16) {
			return num;
		}
		return num % 16 + sumOfSixteen(num / 16);
	}
}
