import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        // create a hash map named as map 
        HashMap<String,Integer> map = new HashMap<>();

        // add values to map 
        map .put("India",120);
        map .put("us",30);
        map .put("china",150);
        map .put("nepal",5);

        // print map
        System.out.println(map);
        map.put("china",180);
        System.out.println(map);

        // search
        System.out.println(map.containsKey("china"));
        System.out.println(map.containsKey("uk"));

        //to get vale of a key 
        System.out.println(map.get("India"));

        // another way to iterate
        int[] arr={1,2,3,4,5,6};
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();

        // way to iterate hash map 
        for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        
        // to remove from map 
        map.remove("napal");
        System.out.println(map);

    }
}
