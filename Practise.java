import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.print("Elements of Array :  ");
        for (int i = 0; i < arr.length; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        selectionsort(arr);
        System.out.print(" Sorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void selectionsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        return;
    }
}