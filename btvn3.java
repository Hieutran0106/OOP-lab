import java.util.Scanner;

public class btvn3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng để căn giữa
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // In các dấu *
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
