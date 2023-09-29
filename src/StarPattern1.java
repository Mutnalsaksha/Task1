import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= scan.nextInt();
        starPattern(n);
    }

    public static void starPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
