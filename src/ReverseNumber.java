import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        reversedNumber(num);
    }

    public static void reversedNumber(int num){
        while(num>0){
            int res=num%10;
            System.out.print(res);
            num=num/10;

        }
    }
}
