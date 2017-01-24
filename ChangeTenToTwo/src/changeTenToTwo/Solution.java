package changeTenToTwo;

import java.util.Scanner;

public class Solution {
	static int arr[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(">");
		int input = sc.nextInt();

		ChangeTenToTwo(input);

	}

	public static void ChangeTenToTwo(int num) {

		if (num > 1) {
			ChangeTenToTwo(num / 2);
			System.out.print(num % 2);
		} else if (num == 1) {
			System.out.print("1");
		}
	}
}
