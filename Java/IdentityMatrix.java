public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] matrix = createIdentityMatrix(3);
        printMatrix(matrix);
    }
    
    public static int[][] createIdentityMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
