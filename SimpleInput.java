package array;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		while (true) {
			int Number = s.nextInt();
			if(Number>=-1000&&Number<=1000) {
			sum = sum + Number;

			if (sum >= 0) {
				System.out.println(Number);
			} else {
				break;
			}
			}
		}
//		System.out.println(sum);
	}
		
	}


