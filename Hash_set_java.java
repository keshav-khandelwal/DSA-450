import java.util.*;

public class Hash_set_java {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // to add
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);

        // size
        int x = set.size();
        System.out.println(x);

        // print set
        System.out.println(set);

        // search
        boolean y = set.contains(8);
        System.out.println(y);

        // delete
        set.remove(0);

        // to check weather set is empty
        boolean z = set.isEmpty();
        System.out.println(z);

        // iterator
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + ", ");
        }

    }
}
