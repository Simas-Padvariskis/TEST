import java.util.Scanner;

public class Task1 {
//---------------------------------------------------------------------------------------------------------------
    public static void logicalOperations () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in the first number:  ");
        int num1 = scanner.nextInt();
        System.out.print("Type in the second number:  ");
        int num2 = scanner.nextInt();
        scanner.close();

        if (num1 % 2 == 0 && num2 % 2 == 0)
            System.out.println("Abu lyginiai: " + true);
        else
            System.out.println("Abu lyginiai: " + false);

        if (num1 > 0 || num2 > 0)
            System.out.println("Bent vienas teigiamas: " + true);
        else
            System.out.println("Bent vienas teigiamas: " + false);

        if (num1 > num2 && num1 % 5 == 0 && num2 % 5 ==0)
            System.out.println("Pirmas skaicius didesnis uz antra ir abu dalomi is 5: " + true);
        else
            System.out.println("Pirmas vienas skaicius didesnis uz antra ir abu dalomi is 5: " + false);
    }
//__________________________________________________________________________________________________________
    public static void main(String[] args) {
        logicalOperations();
    }
}