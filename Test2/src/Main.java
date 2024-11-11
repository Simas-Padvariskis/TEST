import java.util.Scanner;

public class Main {
    //-------------------------------------------------------------------------
    public static void stringOperations (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in the sentence:  ");
        String sentence = scanner.nextLine();
        scanner.close();
        StringBuilder newSentence = new StringBuilder(sentence);

        scanner.close();

        System.out.println("Originalus sakinys: " + sentence);

        System.out.println("Didziosiomis: " + sentence.toUpperCase());

        System.out.println("Atvirkscias: " + newSentence.reverse());

        System.out.println("Zodziu skaicius: " );

        if (sentence.startsWith("Java"))
            System.out.println("Prasideda \"Java\": " + true);
        else
            System.out.println("Prasideda \"Java\": " + false);
    }
    //----------------------------------------------------------------------------------
    public static void main (String[] args){
        stringOperations();
    }
}