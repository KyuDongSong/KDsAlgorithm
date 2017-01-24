package symmetryMountain;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(">");
		int input = sc.nextInt();

		symmetryMountain(input);
	}

	public static void symmetryMountain(int input) {
		if (input == 1) {
			System.out.print(input);
		} else {
			symmetryMountain(input - 1);
			System.out.print(input);
			symmetryMountain(input - 1);
		}
	}

}
