package array;
import java.util.*;
public class simple_input {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of pairs: ");
        int n = s.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            int n1, n2;
            
            do {
                System.out.print("Enter the first number between -1000 and 1000: ");
                n1 = s.nextInt();
            } while (n1 < -1000 || n1 > 1000);
            
            do {
                System.out.print("Enter the second number between -1000 and 1000: ");
                n2 = s.nextInt();
            } while (n2 < -1000 || n2 > 1000);
            
            arr[i] = n1 + n2; // Calculate the sum of the pair
            if (i > 0) {
                arr[i] += arr[i - 1]; // Add the cumulative sum of the previous pair
                System.out.print("Cumulative sums: ");
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[i]);
            }
        }
        
       
        }
        
        
    }
}
