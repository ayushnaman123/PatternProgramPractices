import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        int n; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = scan.nextInt();

        System.out.println("*");

        int i =1; 

        while(i<=n){
            System.out.print("*");

            int j=1;

            while(j<=i){
                System.out.print(j);
                j++;
            }

            j=j-2;

            while (j>=1) {
                System.out.print(j);
                j--;
            }

            i++;
            System.out.println("*");
        }
        
        i=1;
        while (i<=n-1) {
            System.out.print("*"); 
            
            int j=1;

            while (j<=n-i) {
                System.out.print(j);
                j++;
            }

            j=j-2;
            while (j>=1) {
                System.out.print(j);
                j--;
            }

            i++;
            System.out.println("*");


        }
        System.out.print("*");
    }
    
}
