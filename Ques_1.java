//......................................................  REVERSE THE ARRAY   .........................................................

//....................................  1 ST APPROACH  ..................................

// import java.util.*;

// class ques_1 {
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
//         System.out.print("Reversed Array : [ ");
//         for (int c = 0; c < a; c++) {
//             if (c > 0) {
//                 System.out.print(" , ");
//             }
//             System.out.print(array[c]);
//         }
//         System.out.print(" ]");

//     }

//     public static void reversearray(int[] arr) {
//         int a = arr.length;
//         for (int i = 0; i < a / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[a - 1 - i];
//             arr[a - 1 - i] = temp;
//         }

//     }
// }

// .................................... 2 ND APPROACH  .....................................

import java.util.*;

class ques_1 {
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
        reversearray(array);
        System.out.print("Reversed Array : [ ");
        for (int c = 0; c < a; c++) {
            if (c > 0) {
                System.out.print(" , ");
            }
            System.out.print(array[c]);
        }
        System.out.print(" ]");
        sc.close();

    }

    public static void reversearray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
    }
}
