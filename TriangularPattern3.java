import java.util.Scanner;

public class TriangularPattern3 {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scan.nextInt();

        for(int i=1; i<=n; i++){

            int p=i;

            for(int j=1; j<=i; j++){
                System.out.print(p);

                p++;

            }

            System.out.println();

        }
    }
}
