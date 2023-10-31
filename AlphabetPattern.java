import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scan.nextInt();

        for(int i=1; i<=n; i++){

            char ithCharacter = (char)('A'+i-1);
            for(int j=1; j<=i; j++){

                System.out.print(ithCharacter);

            }

            System.out.println();
        }
    }
    
}
