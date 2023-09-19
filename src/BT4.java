public class BT4 {
    public static void main(String[] args) {
        int[][] arr = {{41, 44, 63,}, {32, 63, 43}, {43, 34, 23}};
        int max = 0;
        int t = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("số lớn nhất là : " + max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max == arr[i][j]) {
                    System.out.println("vị trí thứ : " + (t++));
                    System.out.println("nằm ở  vị trí : x = " + j + " || y = " + i);
                }
            }
        }
    }
}
