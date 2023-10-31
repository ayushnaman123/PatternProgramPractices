import java.util.Scanner;

public class TriangularNumberPattern {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = scan.nextInt();

        int p=1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(p);
            }
            p++;

            System.err.println();

        }
    }
}
