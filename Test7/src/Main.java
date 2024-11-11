public class Main {
//----------------------------------------------------------------
    public static double calculate (double num1, double num2, boolean add){
        if (add == true){
            return (num1 + num2);
        }
        else
            return (num1 - num2);
    }
//---------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("Rezultatas: " + (calculate(5.5, 7.5, true)));

    }
}