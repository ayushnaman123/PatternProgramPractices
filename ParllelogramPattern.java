import java.util.Scanner;

public class ParllelogramPattern {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scan.nextInt();

        int i=1;

        while(i<=n){
            
            int j=1;
            while (j<=i-1) {
                System.out.print(" ");
                j++;
            }
           
            int k=1;
            while (k<=n) {
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
    }
    
}
