import java.util.*;
public class Merge_sort {
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
    mergesort(arr,0,a-1);
    System.out.print("Sorted Array : ");
    for(int i =0;i<a;i++){
        System.out.print(arr[i]+" ");
    }
    sc.close();
    }
    public static void mergesort(int[] arr,int low ,int high){
        if(low>=high){
            return;
        }
        int mid =(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        int [] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int i =0;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[i++]=arr[left++];
            }else{
                temp[i++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[i++]=arr[left++];
        }
        while(right<=high){
            temp[i++]=arr[right++];
        }
        for(int j =0;j<temp.length;j++){
            arr[low++]=temp[j];
        }
    }
}
