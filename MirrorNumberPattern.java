import java.util.*;
public class MirrorNumberPattern {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = scan.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print(k);
            }

            System.out.println();
        }
        
    }
    
}
