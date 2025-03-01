import javax.swing.JOptionPane;

public class LinearEquationGUI {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog(null, "Nhập hệ số a:", "Nhập dữ liệu", JOptionPane.INFORMATION_MESSAGE);
        String strB = JOptionPane.showInputDialog(null, "Nhập hệ số b:", "Nhập dữ liệu", JOptionPane.INFORMATION_MESSAGE);
        
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        String result;

        if (a == 0) {
            if (b == 0) {
                result = "Phương trình có vô số nghiệm.";
            } else {
                result = "Phương trình vô nghiệm.";
            }
        } else {
            double x = -b / a;
            result = "Nghiệm của phương trình là: x = " + x;
        }

        JOptionPane.showMessageDialog(null, result, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

