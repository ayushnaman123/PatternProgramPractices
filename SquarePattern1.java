/*Print in this way
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */
import java.util.Scanner;

public class SquarePattern1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();

        int i=1;

        while(i<=n){

            int j=1;

            while(j<=n){
                System.out.print(i);
                j++;
            }

            System.out.println();
            i++;

        }
    
    }
}
