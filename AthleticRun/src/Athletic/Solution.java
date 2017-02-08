package Athletic;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input(arrSize) >>");
		int arrSize = input.nextInt();
		int count;

		int[] arr = new int[arrSize];
		int[] result = new int[arrSize];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Input:" + (i + 1) + "th num");
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			count = 0;

			if (i == 0) {
				result[i] = 1;
				System.out.print(result[i] + ", ");
			} else {
				for (int j = i; j >= 0; j--) {
					if (arr[i] > arr[j]) {
						count++;
					}
				}
				result[i] = (i + 1) - count;
				System.out.print(result[i] + ", ");
			}
		}
	}
}
