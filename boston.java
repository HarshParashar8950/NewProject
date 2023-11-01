package array;
import java.util.*;
public class boston {
public static int Boston(int x,int y) {
	if( x==y) {
		return 1;
	}
	else if (x==0) {
		return 0;
	}
	else {
		return 0;
	}
}
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
//	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int number2=number;
	        int sum =0;
	       int sum1=0;
	        while(number>0) {
	        	int digit=number%10;
	        	sum1=sum1+digit;
	        	number/=10;
	        	
	        }
//	        System.out.println(sum1);
	        
	        
//	        System.out.println("Prime factors of " + number2 + " are:");
	        for (int i = 2; i <= number2; i++) {
	            while (number2 % i == 0) {
//	                System.out.println(i);
	                sum=sum+i;
	                 number2 =number2/ i;
	            }
	        }
//	        System.out.println(sum);
	        int w=Boston(sum1,sum);
	        System.out.println(w);
	    }
	}


