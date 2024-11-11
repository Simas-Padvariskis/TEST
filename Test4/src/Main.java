import java.util.Random;

public class Main {
//-------------------------------------------------------------------
    public static void matrixOperations (){
        int[][] table = new int[3][3];

        table_fill(table);
        table_print(table);
        row_summ(table);

    }
//------------------------------------------------------------------
    public static void table_fill (int[][]matrix){
        Random random = new Random();

        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                matrix[i][j] = random.nextInt(10);
            }
        }
    }
//------------------------------------------------------------------
public static void table_print (int[][]matrix){
    for (int i = 0; i<3; i++){
        for (int j = 0; j<3; j++){
            System.out.printf("%4d", matrix[i][j]);
        }
        System.out.println();
    }
}
//------------------------------------------------------------------
public static void row_summ (int[][]matrix){
    int summ = 0;

    for (int i = 0; i<3; i++){
        for (int j = 0; j<3; j++){
            summ += matrix[i][j];
        }
        System.out.println("Eilutes " + (i+1) + " suma: " + summ);
        summ = 0;
    }
}
//------------------------------------------------------------------
    public static void main(String[] args) {
        matrixOperations();

    }
}