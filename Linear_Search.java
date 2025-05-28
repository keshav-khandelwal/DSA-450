import java.util.*;;

public class Linear_Search {

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
        int k = sc.nextInt();
        int c = searched(array, k);
        System.out.println(" Element " + k + " is at index " + c);
        sc.close();
    }

    public static int searched(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }

        }
        return -1;
    }
}
