import java.util.Scanner;

public class Main {
//--------------------------------------------------------------
    public static void isPalindrome (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in the sentence:  ");
        StringBuilder Sentence = new StringBuilder(scanner.nextLine());
        scanner.close();

        if (Sentence == Sentence.reverse()){
            System.out.println("Žodis \"" + Sentence + "\" yra palindromas: " + true);
        }
        else
            System.out.println("Žodis \"" + Sentence + "\" yra palindromas: " + false);
    }
    public static void main(String[] args) {
        isPalindrome();

    }
}