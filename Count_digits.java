package array;

import java.util.Scanner;

public class Count_digits {
	public static int count_digits(int n, int x) {
		int count = 0;
		while (n > 0) {
			int digit = n % 10;
			if (digit == x) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number  : ");
		int n = s.nextInt();
		if (n >= 0 && n <= 1000000000) {
			System.out.println("Enter the digit you wish to count: ");
			int digit = s.nextInt();
			if (digit >= 0 && digit <= 9) {

				int result = count_digits(n, digit);
				System.out.println("The digit's count is : " + result);
			} else {
				System.out.println("Enter the digit again.");
			}
		} else {
			System.out.println(" Enter the nummber again.");
		}
	}

}
