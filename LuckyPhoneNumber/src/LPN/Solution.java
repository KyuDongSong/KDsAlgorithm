package LPN;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("input > ");
		int num = input.nextInt();

		int count = 0;

		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				if (num == (i + j)) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
