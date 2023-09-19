public class BT3 {
    public static void main(String[] args) {
        int[] arr = {2, 3};
        int[] arr2 = {23, 7};
        int[] arr3 = new int[arr.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr3[count] = arr[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count] = arr2[i];
            count++;
        }
        for (int t :
                arr3) {
            System.out.print(t + " ");
        }
    }
}
