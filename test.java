package array;
import java.util.*;
public class test {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int M = scanner.nextInt(); // Aayush's maximum purchases
            int N = scanner.nextInt(); // Harshit's maximum purchases

            int n = 1;
            while (n * n <= M && n * (n + 1) <= N) {
                n++;
            }

            if (n * n > M) {
                System.out.println("Harshit");
            } else {
                System.out.println("Aayush");
            }

            // Read a line to consume the newline character after the integers
            scanner.nextLine();
        }

//        scanner.close();
    }

}
