// ................................. LARGEST SUM CONTIGUOUS SUB ARRAY
// .........................................................

// ...................... NAIVE SOLUTION
// .............................................
// import java.util.Scanner;

// public class Ques_8 {
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
// int sum = subarray(array);
// System.out.println("Largest Sum = " + sum);
// sc.close();
// }

// public static int subarray(int[] arr) {
// int n = arr.length;
// int maxSum = Integer.MIN_VALUE;
// for (int i = 0; i < n; i++) {
// int sum = 0;
// for (int j = i; j < n; j++) {
// sum += arr[j];
// }
// maxSum = Math.max(maxSum, sum);
// }
// return maxSum;
// }
// }

// .......................................   KADANE'S ALGORITHUM   ...........................................................

import java.util.Scanner;

public class Ques_8 {
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
        int sum = subarray(array);
        System.out.println("Largest Sum = " + sum);
        sc.close();
    }

    public static int subarray(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
