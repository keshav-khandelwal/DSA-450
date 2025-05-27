//................................... K TH SMALLEST AND K TH LARGEST ELEMENT IN ARRAY .........................................................

import java.util.*;

public class Ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size Of array : ");
        int a = sc.nextInt();
        System.out.print("Kth element : ");
        int k = sc.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Array : [ ");
        for (int i = 0; i < a; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(array[i]);
        }
        System.out.println(" ]");
        int ksmall = kSmallest(array, k);
        System.out.println("K th smallest element: " + ksmall);
        int kbig = kbig(array, k);
        System.out.println("K th largest element: " + kbig);
        sc.close();

    }

    public static int kSmallest(int[] arr, int k) {
        boolean[] used = new boolean[arr.length];
        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            min_value = Integer.MAX_VALUE;
            int min_index = -1;
            for (int j = 0; j < arr.length; j++) {
                if (!used[j] && arr[j] < min_value) {
                    min_value = arr[j];
                    min_index = j;
                }
            }
            used[min_index] = true;
        }
        return min_value;
    }

    public static int kbig(int[] arr, int k) {
        boolean[] used = new boolean[arr.length];
        int max_value = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max_value = Integer.MIN_VALUE;
            int max_index = -1;
            for (int j = 0; j < arr.length; j++) {
                if (!used[j] && arr[j] > max_value) {
                    max_value = arr[j];
                    max_index = j;
                }
            }
            used[max_index] = true;
        }
        return max_value;
    }
}
