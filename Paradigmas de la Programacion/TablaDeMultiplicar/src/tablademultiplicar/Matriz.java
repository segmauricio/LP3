package tablademultiplicar;

/**
 *
 * @author laboratorio
 */
public class Matriz {
    public static void main(String[] args) {
        int rows = 8;
        int cols = 8;
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ( i < 4 && j < 4 && i==j) {
                    matrix[i][j] = 1; // If row is less than 4 and column is less than 4, and row is less than total rows and column is less than total rows, set value as 1
                } else {
                    matrix[i][j] = 0; // Otherwise, set value as 0
                }
            }  
        }
        
        // Imprimir la matriz
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

