public class matrixSum {
    public static void main(String[] args) {
        int rows = 2, cols = 3;
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8, 9},
            {1, 2, 3}
        };
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

   
        System.out.println("Sum of two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
