package array;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("ENter the data of array.");
		for (int i = 0; i < n; i++) {
			arr[i] = (i+1)*10;
		}
		
		System.out.println("array is as following.");
		display(arr, n);
	}

	public static void display(int[] arr, int n) {
		int a = n;
		

		for (int i = 0; i < a; i++) {
			System.out.println(arr[i]);
		}
//		or we can do
//for (int i = 0; i < arr.length; i++) {
//		System.out.println(arr[i]);
//	}
	}
}
