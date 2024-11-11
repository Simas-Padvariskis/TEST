import java.util.Scanner;

public class Main {
//--------------------------------------------------------------------
    public static void calculateFactorial (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite n: ");
        int n = scanner.nextInt();
        int factorial = 1;

        for (int i = 2; i<=n; i++){
            factorial *= i;
        }
        System.out.println("Faktorialas(" + n + "!) = " + factorial);
    }
//-------------------------------------------------------------------
    public static void main(String[] args) {
        calculateFactorial();

    }
}