import java.util.Scanner;

public class Rotate_Array_by_k {
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
        System.out.println();
        System.out.print("Rotate Array by : ");
        int k =sc.nextInt();
        optimized(arr, k);
        System.out.print("Rotated Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    public static void bruteforce(int[] arr , int k){
        int n =arr.length;
        k=k%n;
        int[] temp = new int[n];
        int index =0;
        for(int i=n-k;i<=n-1;i++){
            temp[index++]=arr[i];
        }
        for(int i=0;i<=n-1-k;i++){
            temp[index++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        
    }
    public static void optimized(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
