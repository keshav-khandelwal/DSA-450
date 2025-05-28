// ............................. ( IF ARRAY IS SORTED ) ........................................................
// import java.util.Scanner;

// public class Ques_91 {
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
//         int fixed = fixed(array);
//         System.out.print("Fixed Point = " + fixed);
//         sc.close();
//     }

//     public static int fixed(int[] arr) {
//         int low = 0;
//         int n = arr.length;
//         int high = n - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == mid) {
//                 return mid;
//             } else if (arr[mid] > mid) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return -1;

//     }
// }

//...................................( IF ARRAY IS NOT SORTED )   ........................................

import java.util.Scanner;

public class Ques_91 {
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
        int fixed = fixed(array);
        System.out.print("Fixed Point = " + fixed);
        sc.close();
    }

    public static int fixed(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                return i;
            }
        }
        return -1;

    }
}
