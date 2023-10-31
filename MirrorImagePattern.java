import java.util.*;

public class MirrorImagePattern {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scan.nextInt();

        // Initialize i loop for no of rows
        for (int i = 1; i <= n; i++) {

            // Initialize j & k loop for no of columns

            // J loop is for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // k loop is for no of * stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

}
