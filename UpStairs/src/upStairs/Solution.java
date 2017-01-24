package upStairs;

import java.util.Scanner;

public class Solution {

	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(">");
		int input = sc.nextInt();

		System.out.println(countUpStairs(input));
	}

	public static int countUpStairs(int numOfStairs) {
		if (numOfStairs == 0) {
			count++;
		} else if (numOfStairs > 0) {
			countUpStairs(numOfStairs - 1);
			countUpStairs(numOfStairs - 2);
		}
		return count;
	}

}
