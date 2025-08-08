import java.util.Scanner;

public class Second_Smallest_Largest {
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
        System.out.println(" Second Largest element in array: "+largestelement(arr));
        System.out.println(" Second smallest element in array: "+secondsmallest(arr));
        
        sc.close();

    }
    public static int largestelement(int[] arr){
        int max = arr[0];
        int secondlargest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondlargest=max;
                max=arr[i];
            }else if(arr[i]>secondlargest && arr[i]!=max){
                secondlargest=arr[i];
            }
        }
        
        return secondlargest;
    }
    public static int secondsmallest(int[] arr){
        int min=arr[0];
        int secondsmallestv=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secondsmallestv=min;
                min=arr[i];
            }else if(arr[i]!=min && arr[i]<secondsmallestv){
                secondsmallestv=arr[i];
            }
        }
        return secondsmallestv;
    }

}