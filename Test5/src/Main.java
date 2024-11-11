import java.util.Scanner;

public class Main {
//------------------------------------------------------------------------
    public static void printNumbers (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }
        System.out.println();
        for (int i = n; i>=1 ; i--){
            System.out.println(i);
        }
        System.out.println("Visu skaiciu suma: "+ summ(n));
    }
//------------------------------------------------------------------------
    public static int summ (int n){
        int SUMM = 0;
        for (int i = 1; i <= n; i++){
            SUMM += i;
        }
        return SUMM;
    }
//------------------------------------------------------------------------
    public static void main(String[] args) {
        printNumbers();

    }
}