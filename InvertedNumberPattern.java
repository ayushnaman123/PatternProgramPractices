import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = scan.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(n-i+1);

            }
            System.out.println();
        }
    }
    
}
