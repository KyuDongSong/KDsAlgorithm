package grp;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int count = 0;
		int sum;

		System.out.print("input > ");
		int n = input.nextInt();
		int k = input.nextInt();

		for (int i = 1; i <= n; i++) {
			sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += j;
			}
			if ((sum % 15) == 0) {
				System.out.println(sum);
				count++;
			}
		}
		System.out.println(count);

	}
}
