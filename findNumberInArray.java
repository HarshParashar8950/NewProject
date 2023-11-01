package array;

import java.util.Scanner;

public class findNumberInArray {

	public static int search(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the target value.");
		int x = s.nextInt();
		System.out.println("Enter the array data:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int target = search(arr, x);
		System.out.println("The Index value is : " + target);

	}

}
