import java.util.Scanner;

public class InvertedTrianglePattern {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = scan.nextInt();

        int i=1;

        while (i<=n) {

            int j=1;

            while(j<=n-i+1){
                System.out.print("*");
                j++;
            }
            
             System.out.println();
             i++;
        }
    }
}
