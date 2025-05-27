
//..............................................  MAXIMUM AND MINIMUM OF ARRAY .......................................................

import java.util.Scanner;

class Ques_2 {
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
        int[] result = maxMin(array);
        System.out.println("Minimum of array : " + result[0]);
        System.out.println("Maximum of array : " + result[1]);
        sc.close();

    }

    public static int[] maxMin(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[] { min, max };
    }
}
