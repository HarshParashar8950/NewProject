package array;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
//		array is created in heap memory as it is user defined data type, 
//		but in cpp array can be stored in both heap and stack
		// TODO Auto-generated method stub
		
		//(int [] arr )is created in the stack to store addresses;

				//		new int arr[5] is created in the heap memory.

				//		here arr is a refrence variable or address variable but not an array.(which stores the address of an array)		
				
		
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5]; 

		for(int i=0;i<5;i++) {
			arr[i]=s.nextInt();
			
		}
		display(arr);
	}
	public static void display(int [] arr) {
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}

}
