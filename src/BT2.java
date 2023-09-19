import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int[] arr = {3, 23, 55, 32};
        for (int t :
                arr) {
            System.out.print(t + " ");
        }
        System.out.println("\nNhập số muốn thêm :");
        int nb = new Scanner(System.in).nextInt();
        int[] arr1 = new int[arr.length + 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr1[count] = arr[i];
            count ++;
        }
        arr1[count] = nb;
        for (int t :
                arr1) {
            System.out.print(t + " ");
        }
    }
}
