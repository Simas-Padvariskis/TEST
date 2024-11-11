import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //----------------------------------------------------------------
    public static void arrayOperations (){
        Scanner scanner = new Scanner(System.in);
        int[] numbers= new int [5];

        for (int i = 0; i<5; i++){
            System.out.print("Type in the [" + (i+1) + "] number: ");
            numbers[i]  = scanner.nextInt();
        }
        System.out.println("Type in the number to search in the array: ");
        int search = scanner.nextInt();
        scanner.close();

        Arrays.sort(numbers);

        if (Arrays.binarySearch(numbers, search) >= 0)
            System.out.println(search + " is in array: " + true);
        else
            System.out.println(search + " is in array: " + false);

        System.out.println("Didziausias: " + numbers[numbers.length-1]);

        System.out.println("Maziausias: " + numbers[0]);

        System.out.println("Vidurkis: " + average(numbers));
    }
//-------------------------------------------------------------
    public static double average (int[] nums){
        int summ = 0;
        for (int i = 0; i<5; i++){
            summ += nums[i];
        }
        return (double) summ/5;
    }
//--------------------------------------------------------------
    public static void main(String[] args) {

       arrayOperations();
    }
}