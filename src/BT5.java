import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        int size = 0;
        System.out.println("Nhập số phần tử trong mảng :");
        int choice = new Scanner(System.in).nextInt();
        if (choice > 20) {
            System.out.println("phần tử trong mảng <= 20");
        }
        int[] arr = new int[choice];
        do {
            System.out.println("phần tử thứ : " + (size+1));
            int nb = new Scanner(System.in).nextInt();
            arr[size] = nb;
            size++;
        }
        while (choice>size);
        System.out.println("trong mảng :");
        int min = arr[0];
        for (int t :
                arr) {
            System.out.print(t + " , ");
            if (min > t) {
                min = t;
            }
        }
        System.out.println("\n phần tử bé nhất trong mảng là :" + min);
    }
}
