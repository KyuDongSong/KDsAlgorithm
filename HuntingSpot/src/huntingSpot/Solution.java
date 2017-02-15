package huntingSpot;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input Num Of ShootingSpot: ");
		int numOfSpot = input.nextInt();
		int[] shootingSpot = new int[numOfSpot];
		System.out.print("Input Num Of Animals: ");
		int numOfAnimal = input.nextInt();
		int[] targetX = new int[numOfAnimal];
		int[] targetY = new int[numOfAnimal];
		System.out.print("Input Max Length: ");
		int length = input.nextInt();

		for (int i = 0; i < numOfSpot; i++) {
			shootingSpot[i] = input.nextInt();
		}
		for (int i = 0; i < numOfAnimal; i++) {
			System.out.print("Input Animals Position Of X ");
			targetX[i] = input.nextInt();
			System.out.print("Input Animals Position Of Y ");
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
	}

	public static int findAbsoluteValue(int input) {
		if (input < 0) {
			return input * -1;
		} else {
			return input;
		}
	}
}
