import java.util.Scanner;

public class TriangleNumberPattern {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = scan.nextInt();
        
        //n=5
        for(int i=1; i<=n; i++){

            int num=i;

            for(int j=1; j<=n+i-1; j++){
                if(j<=n-i){ 

                    System.out.print(" ");

                }else if(j<n){

                    System.out.print(num);
                    num++;

                }else{
                    System.out.print(num);
                    num--;
                }
            }

            System.out.println();


        }
    }
    
}
