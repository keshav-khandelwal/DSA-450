
import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Size of Array: ");
    int a = sc.nextInt();
    int[] arr =new int[a];
    System.out.println("Elements of Array: ");
    for(int i =0;i<a;i++){
        int b = sc.nextInt();
        arr[i]=b;
    }
    System.out.print("Array : ");
    for(int i =0;i<a;i++){
        System.out.print(arr[i]+" ");
    }
    quicksort(arr,0,a-1);
    System.out.print("Sorted Array : ");
    for(int i =0;i<a;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();
    }
    public static void quicksort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int pivot = sortedpivot(arr,low,high);
        quicksort(arr, low, pivot-1);
        quicksort(arr, pivot+1, high);
    }
    public static int sortedpivot(int[] arr,int low ,int high){
        int pivot =arr[high];
        int i=low;
        for(int j =low;j<high;j++){
            if(arr[j]<pivot){
                swap(arr,j,i);
                i++;
            }
        }
        swap(arr,i,high);
        return i;
    }
    public static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
