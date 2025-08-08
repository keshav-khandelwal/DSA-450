import java.util.*;
public class Ques_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array = ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.print("Elements of array: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array : [ ");
        for (int c = 0; c < a; c++) {
            if (c > 0) {
                System.out.print(" , ");
            }
            System.out.print(arr[c]);
        }
        System.out.println(" ]");
        int result = majorityelement(arr);
        System.out.println("Majority Element: "+result);
    }
    public static int majorityelement(int[] arr){
        int n =arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int maxkey =0;
        int maxvalue=0;
        for(Map.Entry<Integer,Integer> e :map.entrySet()){
            if(e.getValue()>maxvalue){
                maxvalue=e.getValue();
                maxkey=e.getKey();
            }
        }
        return maxkey;
    }
}
