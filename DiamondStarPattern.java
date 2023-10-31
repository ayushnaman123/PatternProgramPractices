/*
 * Code : Diamond of stars

Print the following pattern for the given number of rows.
Note: N is always odd.


 */
import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = scan.nextInt();

        int n1 = (n+1)/2;

        for(int i=1; i<=n1; i++){

            for(int space =1; space<=n1-i; space++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");

            }

            System.out.println();

        }

        int n2 = n/2;

        for(int i=n2; i>=1; i--){

            for(int space =1; space<=(n2-i)+1; space++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
