import java.util.*;

class ques_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array1 = ");
        int a = sc.nextInt();
        int array1[] = new int[a];
        System.out.print("Elements of array1: ");
        for (int i = 0; i < a; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.print("Array 1: [ ");
        for (int c = 0; c < a; c++) {
            if (c > 0) {
                System.out.print(" , ");
            }
            System.out.print(array1[c]);
        }
        System.out.println(" ]");
        System.out.print("Size of Array2 = ");
        int b = sc.nextInt();
        int array2[] = new int[b];
        System.out.print("Elements of array:2 ");
        for (int y = 0; y < b; y++) {
            array2[y] = sc.nextInt();
        }
        System.out.print("Array2 : [ ");
        for (int d = 0; d < b; d++) {
            if (d > 0) {
                System.out.print(" , ");
            }
            System.out.print(array2[d]);
        }
        System.out.println(" ]");
        int[] union = union(array1, array2);
        System.out.print("Union : [ ");
        for (int e = 0; e < union.length; e++) {
            if (e > 0) {
                System.out.print(" , ");
            }
            System.out.print(union[e]);
        }
        System.out.println(" ]");
        int[] intersection = intersection(array1, array2);
        System.out.print("Intersection : [ ");
        for (int f = 0; f < intersection.length; f++) {
            if (f > 0) {
                System.out.print(" , ");
            }
            System.out.print(union[f]);
        }
        System.out.println(" ]");
        sc.close();

    }

    // UNION

    public static int[] union(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> unionList = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                unionList.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                unionList.add(arr2[j]);
                j++;
            } else {
                unionList.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                unionList.add(arr1[i]);
                i++;
            }
        }
        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                unionList.add(arr2[j]);
                j++;
            }
        }
        int[] unionArray = new int[unionList.size()];
        for (int k = 0; k < unionList.size(); k++) {
            unionArray[k] = unionList.get(k);
        }
        return unionArray;

    }

    // INTERSECTION

    public static int[] intersection(int[] arr1, int[] arr2) {
        List<Integer> intersectionList = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersectionList.add(arr2[i]);
                i++;
                j++;
            }
        }
        int[] intersectionArray = new int[intersectionList.size()];
        for (int k = 0; k < intersectionArray.length; k++) {
            intersectionArray[k] = intersectionList.get(k);
        }
        return intersectionArray;
    }
}