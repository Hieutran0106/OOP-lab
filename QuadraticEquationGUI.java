import javax.swing.JOptionPane;

public class QuadraticEquationGUI {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog(null, "Nhập hệ số a:", "Nhập dữ liệu", JOptionPane.INFORMATION_MESSAGE);
        String strB = JOptionPane.showInputDialog(null, "Nhập hệ số b:", "Nhập dữ liệu", JOptionPane.INFORMATION_MESSAGE);
        String strC = JOptionPane.showInputDialog(null, "Nhập hệ số c:", "Nhập dữ liệu", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);
        String result;

        if (a == 0) {
            result = "Đây không phải phương trình bậc hai.";
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "Phương trình có hai nghiệm phân biệt:\n" + "x1 = " + x1 + "\n" + "x2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "Phương trình có nghiệm kép: x = " + x;
            } else {
                result = "Phương trình vô nghiệm.";
            }
        }

        JOptionPane.showMessageDialog(null, result, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
