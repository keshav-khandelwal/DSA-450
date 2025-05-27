//.................................... ROTATE ARRAY BY ONE ..............................................................................

// import java.util.Scanner;

// public class Ques_7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Size of Array = ");
//         int a = sc.nextInt();
//         int array[] = new int[a];
//         System.out.print("Elements of array: ");
//         for (int i = 0; i < a; i++) {
//             array[i] = sc.nextInt();
//         }
//         System.out.print("Array : [ ");
//         for (int c = 0; c < a; c++) {
//             if (c > 0) {
//                 System.out.print(" , ");
//             }
//             System.out.print(array[c]);
//         }
//         System.out.println(" ]");
//         reversearray(array);
//         System.out.print("Reversed Array By 1 : [ ");
//         for (int c = 0; c < a; c++) {
//             if (c > 0) {
//                 System.out.print(" , ");
//             }
//             System.out.print(array[c]);
//         }
//         System.out.print(" ]");
//         sc.close();
//     }

//     public static void reversearray(int[] arr) {
//         int n = arr.length;
//         int temp = arr[n - 1];
//         int k = 0;
//         for (int i = 0; i < n; i++) {
//             k = arr[i];
//             arr[i] = temp;
//             temp = k;
//         }
//         return;
//     }
// }

//.................................... ROTATAE ARRAY BY K PLACES  .................................................

import java.util.Scanner;

public class Ques_7 {
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
        System.out.print("Reverse array no of places  = ");
        int k = sc.nextInt();
        reversearray(array, k);
        System.out.print("Reversed Array By " + k + " places : [ ");
        for (int c = 0; c < a; c++) {
            if (c > 0) {
                System.out.print(" , ");
            }
            System.out.print(array[c]);
        }
        System.out.print(" ]");
        sc.close();
    }

    public static void reversearray(int[] arr, int k) {
        int n = arr.length;
        k = k % arr.length;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        return;
    }

    public static void reverse(int[] arr, int start, int end) {
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        return;
    }
}
