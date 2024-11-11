import java.util.Random;

public class Main {
    //-------------------------------------------------------------------
    public static void matrixOperations (){
        int[][] table = new int[4][4];

        table_fill(table);
        table_print(table);

    }
    //------------------------------------------------------------------
    public static void table_fill (int[][]matrix){
        Random random = new Random();

        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                matrix[i][j] = random.nextInt(20);
            }
        }
    }
    //------------------------------------------------------------------
    public static void table_print (int[][]matrix){
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
    //------------------------------------------------------------------
    public static void main(String[] args) {
        matrixOperations();

    }
}