import java.util.Scanner;

public class SumPattern {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = scan.nextInt();

        int sum=0;

        for(int i=1; i<=n; i++){
            sum+=i;

            for(int j=1; j<=i; j++){
                System.out.print(j);

                if(i==j){
                    System.out.print("=");
                }else{
                    System.out.print("+");
                }
            }
            System.out.println(sum);
        }
    }
}
