import java.util.*;

public class Ques_288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Total not of elements in stack = ");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            st.push(a);
        }
        System.out.println(st);
        displayst(st);
        System.out.println();
        reversestack(st);
        System.out.println(st);

        System.out.print(" Remove From Index = ");
        int index = sc.nextInt();
        removeatindex(st, index);
        System.out.println(st);
        sc.close();
        insertatindex(st, index);
        System.out.println(st);
    }

    public static void displayst(Stack<Integer> st) {
        if (st.size() == 0) {
            System.out.println();
            return;
        }
        int top = st.pop();
        System.out.print(top + " , ");
        displayst(st);
        System.out.print(top + " , ");
        st.push(top);
    }

    public static void reversestack(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        int top = st.pop();
        reversestack(st);
        insert(st, top);
    }

    public static void insert(Stack<Integer> st, int top) {
        if (st.size() == 0) {
            st.push(top);
            return;
        }
        int prev = st.pop();
        insert(st, top);
        st.push(prev);
    }

    public static void removeatindex(Stack<Integer> st, int index) {
        if (st.size() == index + 1) {
            st.pop();
            return;
        }
        int top = st.pop();
        removeatindex(st, index);
        st.push(top);

    }

    public static void insertatindex(Stack<Integer> st, int index) {
        if (st.size() == index) {
            st.push(0);
            return;
        }
        int top = st.pop();
        insertatindex(st, index);
        st.push(top);

    }

}