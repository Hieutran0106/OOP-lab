import java.util.Scanner;

public class btvn6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();
        
        int[][] matrix1 = nhapMaTran(scanner, rows, cols, "thứ nhất");
        int[][] matrix2 = nhapMaTran(scanner, rows, cols, "thứ hai");
        
        int[][] sumMatrix = congHaiMaTran(matrix1, matrix2, rows, cols);
        
        System.out.println("Ma trận tổng:");
        hienThiMaTran(sumMatrix);
        
        scanner.close();
    }
    
    private static int[][] nhapMaTran(Scanner scanner, int rows, int cols, String ten) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Nhập các phần tử của ma trận " + ten + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    
    private static int[][] congHaiMaTran(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }
    
    private static void hienThiMaTran(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
