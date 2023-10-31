import java.util.Scanner;

public class CharacterPatterns {
    public static void main(String[] args) {
        
        int n;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scan.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                char jthCharacter =(char) ('A'+j-1);
                System.out.print(jthCharacter);

            }

            System.out.println();
        }
    }
}
