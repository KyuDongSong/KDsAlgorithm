package mountain;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">");
		int input = sc.nextInt();
		
		up(input-1);
		down(input);
	}
	
	public static void up(int num){
		if(num == 1){
			System.out.print(num);
		} else {
			up(num - 1);
			System.out.print(num);
		}
		
	}
	
	public static void down(int num){
		if(num == 1){
			System.out.print(num);
		} else {
			System.out.print(num);
			down(num - 1);
		}
	}
}
