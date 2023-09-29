import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the number1: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the number1: ");
        int num3 = scan.nextInt();
        largestNumber(num1,num2,num3);

    }

    public static void largestNumber(int num1,int num2,int num3){
        if(num1>=num2 && num1>=num3){
            System.out.println("--->"+num1+" is largest");
        }else if(num2>=num1 && num2>=num3){
            System.out.println("--->"+num2+" is largest");
        } else{
            System.out.println("--->"+num3+" is largest");
        }
    }
}
