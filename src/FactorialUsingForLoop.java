import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scan.nextInt();
        int res=factorialOfNumber(num);
        System.out.println("Result: "+res);
    }

    public static int factorialOfNumber(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        //System.out.println("Result: "+fact);
        return fact;
    }
}
