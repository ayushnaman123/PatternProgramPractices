import java.util.Scanner;

public class InterestingAlphabet {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = scan.nextInt();

        for(int i=1; i<=n; i++){
             char ithCharacter = (char)('A'+n-i);
            for(int j=1; j<=i; j++){
                System.out.print(ithCharacter);
                ithCharacter = (char)(ithCharacter+1);
            }
            System.out.println();
        }
    }
}
