import java.util.Scanner;

public class TriangleNumberPattern2 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = scan.nextInt();
        
        //n=6;  
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
             
            int valToPrint = i;

            for(int k=1; k<=i; k++){
                System.out.print(valToPrint);
                valToPrint++;
            }

            valToPrint=2*i-2;

            for(int l=1; l<=i-1; l++){
              System.out.print(valToPrint);
              valToPrint--;
            }
            System.out.println();
        }

    }
}
