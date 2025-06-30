package MatrixProblems;

//write a 4*4 matrix of integers each having only two letters(implement spiral matrix logic)
import java.util.*;
public class Matrix1 {
    private static int rowSize;
    private static int columnSize;
    private static int matrix[][];
      public static void printSpiral(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        System.out.println("the spiral matrix is:");
        while (top <= bottom && left <= right) {
            //  (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            // (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                // (right to left)
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                // Print left column (bottom to top)
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void readMatrix(int matrix[][]){
        System.out.println("the original matrix is: ");
        for(int i =0;i < rowSize;i++){
            for(int j = 0;j < columnSize;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of row elements ");
        rowSize = scanner.nextInt();
        System.out.println("enter the size of column elements");
        columnSize = scanner.nextInt();
        matrix = new int[rowSize][columnSize];
        int value = 10;
        for(int i =0;i<rowSize;i++){
            for(int j = 0;j < columnSize;j++){
                matrix[i][j] = value++;
                if(value > 99 ){
                    value = 10;
                }
            }
        }
        scanner.close();
         readMatrix(matrix);
         printSpiral(matrix);


    }
}
