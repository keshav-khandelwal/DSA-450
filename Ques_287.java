import java.util.*;

public class Ques_287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Stack = ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.print("Elements of Stack = ");
        while (st.size() != n) {
            int a = sc.nextInt();
            st.push(a);
        }
        System.out.println(st);
        System.out.print("Element to be inserted in bottom : ");
        int b = sc.nextInt();
        insert(st, b);
        System.out.println(st);
        sc.close();
    }

    public static void insert(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int a = st.pop();
        insert(st, x);
        st.push(a);
        return;
    }
}
