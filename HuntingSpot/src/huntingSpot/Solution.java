package huntingSpot;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numOfSpot = input.nextInt();
		int[] shootingSpot = new int[numOfSpot];

		int numOfAnimal = input.nextInt();
		int[] targetX = new int[numOfAnimal];
		int[] targetY = new int[numOfAnimal];

		int length = input.nextInt();

		for (int i = 0; i < numOfSpot; i++) {
			shootingSpot[i] = input.nextInt();
		}
		for (int i = 0; i < numOfAnimal; i++) {
			targetX[i] = input.nextInt();
			targetY[i] = input.nextInt();
		}

		int count = 0;

		for (int i = 0; i < numOfAnimal; i++) {
			for (int j = 0; j < numOfSpot; j++) {
				if ((findAbsoluteValue((shootingSpot[j] - targetX[i])) + targetY[i]) <= length) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		input.close();
	}

	public static int findAbsoluteValue(int input) {
		if (input < 0) {
			return input * -1;
		} else {
			return input;
		}
	}
}
