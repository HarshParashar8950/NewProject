package array;

import java.util.Scanner;

public class minimumofanarray {

	 
	public static int minimum(int [] arr) {
		int min=arr[0];
		for(int j=1;j<arr.length;j++) {
			if(min>arr[j]) {
				min=arr[j];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array.");
		int n = s.nextInt();
		int [] arr=new int [n];
		System.out.println("Enter the array data:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int min_ans= minimum(arr);
		System.out.println("Minimum is "+min_ans);
		
	}

}
