package array;
import java.util.*;
public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		

		int val = s.nextInt();
		int result=ls(arr,val);
		System.out.println(result);

	}
	public static int ls(int [] arr,int val) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				return i;
			}
			
		
		}
		return -1;
		
	}

}
