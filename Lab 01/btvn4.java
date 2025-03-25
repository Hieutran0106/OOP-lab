import java.util.Scanner;

public class btvn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập tháng (1-12 hoặc tên tháng): ");
        String monthInput = scanner.next();
        
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        
        int month = convertMonthToNumber(monthInput);
        
        if (month == -1 || year < 0) {
            System.out.println("Dữ liệu nhập không hợp lệ. Vui lòng thử lại.");
        } else {
            int days = getDaysInMonth(month, year);
            System.out.println("Số ngày trong tháng " + monthInput + " năm " + year + " là: " + days);
        }
        
        scanner.close();
    }
    
    public static int convertMonthToNumber(String month) {
        month = month.toLowerCase();
        switch (month) {
            case "january": case "jan": case "1": return 1;
            case "february": case "feb": case "2": return 2;
            case "march": case "mar": case "3": return 3;
            case "april": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug": case "8": return 8;
            case "september": case "sep": case "9": return 9;
            case "october": case "oct": case "10": return 10;
            case "november": case "nov": case "11": return 11;
            case "december": case "dec": case "12": return 12;
            default: return -1;
        }
    }
    
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11: return 30;
            case 2: return (isLeapYear(year) ? 29 : 28);
            default: return 31;
        }
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
