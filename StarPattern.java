import java.util.Scanner;

//1st Aproach
public class StarPattern {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = scan.nextInt();

        int i=1;

        while (i<=n) {
            int j=1;
            while (j<=n-i) {
                System.out.print(" ");
                j++;
            }

            int k=1;
            while (k<=i) {
                System.out.print("*");
                k++;
            }

            int l=i-1;
            while (l>=1) {
                System.out.print("*");
                l--;
            }

            i++;
            System.out.println();
        }
    }
}
