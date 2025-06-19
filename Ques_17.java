import java.util.Scanner;

public class Ques_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array = ");
        int a = sc.nextInt();
        int array[] = new int[a];
        System.out.print("Elements of array: ");
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Array : [ ");
        for (int c = 0; c < a; c++) {
            if (c > 0) {
                System.out.print(" , ");
            }
            System.out.print(array[c]);
        }
        System.out.println(" ]");
        int b = profit(array);
        System.out.print("Max Profit = " + b);
        sc.close();
    }

    public static int profit(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        int res = 0;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            res = Math.max(res, arr[i] - min);
        }
        return res;
    }

}
