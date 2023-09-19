import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của một số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số chia hết cho 3");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    kiemTraChanLe();
                    break;
                case 2:
                    kiemTraSoNguyenTo();
                    break;
                case 3:
                    kiemTraChiaHetCho3();
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

    public static void kiemTraChanLe() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }

    public static void kiemTraSoNguyenTo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + " không là số nguyên tố.");
        }
    }

    public static void kiemTraChiaHetCho3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int number = input.nextInt();

        if (number % 3 == 0) {
            System.out.println(number + " chia hết cho 3.");
        } else {
            System.out.println(number + " không chia hết cho 3.");
        }
    }
}
