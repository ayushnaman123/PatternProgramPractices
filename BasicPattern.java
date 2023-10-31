import java.util.Scanner;

public class BasicPattern {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = scan.nextInt();

        int i=1;

       // int j=1; If we assign j here then j value will be n number, it

        while(i<=num){
            
            int j=1; // If we assign j here, once the control goes to out of j loop then again j=1;
            
            while (j<=num) {
                System.out.print("*");
                j++;
                
            }
            System.out.println();
            i++;

        }
    }
}
