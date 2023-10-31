import java.util.Scanner;

public class SquarePattern3 {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(n - j + 1);
            }

            System.out.println();

        }
    }
}
