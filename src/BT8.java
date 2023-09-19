import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        while (true) {
            System.out.print("Nhập độ dài cạnh a: ");
            a = input.nextDouble();
            System.out.print("Nhập độ dài cạnh b: ");
            b = input.nextDouble();
            System.out.print("Nhập độ dài cạnh c: ");
            c = input.nextDouble();
            if (isTamGiac(a, b, c)) {
                double chuVi = a + b + c;
                double p = chuVi / 2;
                double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Chu vi của tam giác là: " + chuVi);
                System.out.println("Diện tích của tam giác là: " + dienTich);
                break;
            } else {
                System.out.println("Ba cạnh không tạo thành tam giác. Vui lòng nhập lại.");
            }
        }
    }
    public static boolean isTamGiac(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }
}
