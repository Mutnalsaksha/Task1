import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = scan.next().charAt(0);
        vowelOrConsonant(ch);
    }

    public static void vowelOrConsonant(char ch){
        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' ||ch=='I' || ch=='i' ||ch=='O' || ch=='o' || ch=='U' || ch=='u'){
            System.out.println("Its a Vowel");
        }else if(ch!='A' || ch!='a' || ch!='E' || ch!='e' ||ch!='I' || ch!='i' ||ch!='O' || ch!='o' || ch!='U' || ch!='u'){
            System.out.println("Its a Consonant");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
