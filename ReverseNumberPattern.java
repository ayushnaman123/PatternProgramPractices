import java.util.Scanner;

public class ReverseNumberPattern {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();


        for(int i=1; i<=n; i++){
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
