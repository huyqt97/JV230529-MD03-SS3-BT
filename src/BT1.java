import java.util.Scanner;

public class BT1 {
        public static void main(String[] args) {
            int[] arr = {23, 433, 43423, 434, 32432, 53325, 2, 54, 325, 432, 4, 23532, 5, 325, 23523, 34322, 423412, 123};
            for (int t : arr) {
                System.out.print(t + " , ");
            }
            System.out.println("\n Nhập số muốn xóa:");
            int nb = new Scanner(System.in).nextInt();
            int check = -1;
            for (int t : arr) {
                if (nb == t) {
                    check = t;
                    break;
                }
            }
            if (check != -1) {
                int[] arrNew = new int[arr.length - 1];
                int newIndex = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (nb != arr[i]) {
                        arrNew[newIndex] = arr[i];
                        newIndex++;
                    }
                }
                System.out.println("Mảng mới sau khi xóa:");
                for (int t : arrNew) {
                    System.out.print(t + " , ");
                }
            } else {
                System.out.println("Số không tồn tại trong mảng");
            }
        }

}
