import java.util.Scanner;
import java.util.Arrays;

public class btvn5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = nhapSoNguyenDuong(scanner, "Nhập số lượng phần tử: ");
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nhapSoThuc(scanner, "Nhập phần tử thứ " + (i + 1) + ": ");
        }

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(arr);
        
        double tong = tinhTong(arr);
        double trungBinh = tong / n;

        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(arr));
        System.out.println("Tổng các phần tử: " + tong);
        System.out.println("Giá trị trung bình: " + String.format("%.2f", trungBinh));

        scanner.close();
    }

    private static int nhapSoNguyenDuong(Scanner scanner, String thongBao) {
        int num;
        do {
            System.out.print(thongBao);
            while (!scanner.hasNextInt()) {
                System.out.println("Dữ liệu không hợp lệ! Vui lòng nhập một số nguyên dương.");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0);
        return num;
    }

    private static double nhapSoThuc(Scanner scanner, String thongBao) {
        double num;
        do {
            System.out.print(thongBao);
            while (!scanner.hasNextDouble()) {
                System.out.println("Dữ liệu không hợp lệ! Vui lòng nhập một số hợp lệ.");
                scanner.next();
            }
            num = scanner.nextDouble();
        } while (num < 0);
        return num;
    }
    
    private static double tinhTong(double[] arr) {
        double tong = 0;
        for (double num : arr) {
            tong += num;
        }
        return tong;
    }
}
