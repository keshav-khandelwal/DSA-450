
// ............................................ SORT AN ARRAY OF 0S, 1S AND 2S ..................................................

// ................................... NAIVE APPROACH ............................

// import java.util.Scanner;

// public class Ques_4 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Size of Array = ");
// int a = sc.nextInt();
// int array[] = new int[a];
// System.out.print("Elements of array: ");
// for (int i = 0; i < a; i++) {
// array[i] = sc.nextInt();
// }
// System.out.print("Array : [ ");
// for (int c = 0; c < a; c++) {
// if (c > 0) {
// System.out.print(" , ");
// }
// System.out.print(array[c]);
// }
// System.out.println(" ]");
// sorted(array);
// System.out.print("Array : [ ");
// for (int c = 0; c < a; c++) {
// if (c > 0) {
// System.out.print(" , ");
// }
// System.out.print(array[c]);
// }
// System.out.println(" ]");
// }

// public static void sorted(int[] arr) {
// int n = arr.length;
// int c0 = 0;
// int c1 = 0;
// int c2 = 0;
// for (int i = 0; i < n; i++) {

// if (arr[i] == 0) {
// c0++;
// } else if (arr[i] == 1) {
// c1++;
// } else {
// c2++;
// }
// }
// for (int j = 0; j < c0; j++) {
// arr[j] = 0;
// }
// for (int j = c0; j < c0 + c1; j++) {
// arr[j] = 1;
// }
// for (int j = c0 + c1; j < c0 + c1 + c2; j++) {
// arr[j] = 2;
// }
// }
// }

// ................................................. DUTCH NATIONAL FLAG ALGORITHUM ......................................................

import java.util.*;

class ques_4 {
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
        dutch(array);
        System.out.print(" DNF Sorted Array : [ ");
        for (int c = 0; c < a; c++) {
            if (c > 0) {
                System.out.print(" , ");
            }
            System.out.print(array[c]);
        }
        System.out.println(" ]");
        sc.close();

    }

    public static void dutch(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}