import java.util.Scanner;

public class Ques_92 {
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
        int c = index(array, b);
        System.out.println("Element " + b + " is at index " + c);
        sc.close();
    }

    public static int index(int[] arr, int k) {
        int min = min(arr);
        int n = arr.length;
        if (arr[min] == k) {
            return min;
        }
        if (min == 0) {
            return (binary(arr, 0, n - 1, k));
        }
        if (arr[0] <= k) {
            return binary(arr, 0, min - 1, k);
        } else {
            return binary(arr, min, n - 1, k);
        }

    }

    public static int binary(int[] arr, int low, int high, int k) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int min(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            if (arr[low] <= arr[high]) {
                return low;
            }
            int mid = (low + high) / 2;
            if (arr[mid] <= arr[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

}
