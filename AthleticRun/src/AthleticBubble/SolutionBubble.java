package AthleticBubble;

import java.util.Scanner;

public class SolutionBubble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Input >> ");
		int arrSize = input.nextInt();

		int[] arr = new int[arrSize];
		int[] tmp = new int[arrSize];

		int tmpNum = 0;
		int count = 0;

		System.out.print("Input >> ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
			tmp[i] = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				if (arr[i] > arr[i - 1]) {
					tmpNum = arr[i - 1];
					arr[i - 1] = arr[1];
					arr[i] = tmpNum;
					tmp[i] = arr[i];
				}
			} else if (i == 0) {
				arr[i] = 1;
			}
			System.out.print(tmp[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
