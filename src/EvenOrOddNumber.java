
import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scan.nextInt();
        evenOrOdd(num);
    }

    public static void evenOrOdd(int num){
        if(num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
