//..........................................  USING BINARY SEARCH ALGORITHM (OPTIMAL SOLUTION)   .......................................
// import java.util.*;

// public class Ques_90 {
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
//         System.out.print("Element to be searched = ");
//         int b = sc.nextInt();

//         ArrayList<Integer> res = new ArrayList<>();
//         res.add(first(array, b));
//         res.add(last(array, b));
//         System.out.println(res);
//         sc.close();

//     }

//     public static int first(int[] arr, int k) {
//         int low = 0;
//         int n = arr.length;
//         int high = n - 1;
//         int first = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == k) {
//                 first = mid;
//                 high = mid - 1;
//             } else if (arr[mid] > k) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return first;
//     }

//     public static int last(int[] arr, int k) {
//         int low = 0;
//         int n = arr.length;
//         int high = n - 1;
//         int last = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == k) {
//                 last = mid;
//                 low = mid + 1;
//             } else if (arr[mid] > k) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return last;
//     }
// }

//...............................  NAIVE SOLUTION  ..........................................

import java.util.*;

public class Ques_90 {
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
        System.out.print("Element to be searched = ");
        int b = sc.nextInt();

        ArrayList<Integer> res = new ArrayList<>();
        res = res(array, b);
        System.out.println(res);
        sc.close();
    }

    public static ArrayList<Integer> res(int[] arr, int k) {
        int n = arr.length;
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                if (first == -1) {
                    first = i;
                    last = i;
                } else {
                    last = i;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        return res;
    }
}
