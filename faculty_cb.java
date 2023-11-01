package array;

import java.util.Scanner;

public class faculty_cb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int TestCase=s.nextInt();
		if(TestCase<=1000&&TestCase>=1) {
			for(int t=0;t<TestCase;t++) {
				int M=s.nextInt();
				int N=s.nextInt();
				int n=1;
				
					
				
				while(n*n<=M&&n*(n+1)<=N) {
					n++;
				}
				if(n*n>M) {
					System.out.println("Harshit");
				}
				else if(n*(n+1)>N) {
					System.out.println("Aayush");
				}
				
//				  s.nextLine();
				
			}
		}
	}

}

