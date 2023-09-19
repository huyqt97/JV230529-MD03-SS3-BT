import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    tinhChuViDienTichHinhChuNhat();
                    break;
                case 2:
                    tinhChuViDienTichHinhTamGiac();
                    break;
                case 3:
                    tinhChuViDienTichHinhTron();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }
        }
    }

    public static void tinhChuViDienTichHinhChuNhat() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = input.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = input.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
    }

    public static void tinhChuViDienTichHinhTamGiac() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh a của tam giác: ");
        double a = input.nextDouble();
        System.out.print("Nhập độ dài cạnh b của tam giác: ");
        double b = input.nextDouble();
        System.out.print("Nhập độ dài cạnh c của tam giác: ");
        double c = input.nextDouble();

        double chuVi = a + b + c;
        double p = chuVi / 2; // Nửa chu vi
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Chu vi của tam giác là: " + chuVi);
        System.out.println("Diện tích của tam giác là: " + dienTich);
    }

    public static void tinhChuViDienTichHinhTron() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = input.nextDouble();

        final double PI = 3.14;
        double chuVi = 2 * PI * banKinh;
        double dienTich = PI * (banKinh * banKinh);

        System.out.println("Chu vi của hình tròn là: " + chuVi);
        System.out.println("Diện tích của hình tròn là: " + dienTich);
    }
}
