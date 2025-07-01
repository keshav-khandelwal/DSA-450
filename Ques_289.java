
// ................................................  Sort an stack using recurssion .....................................
import java.util.Scanner;
import java.util.Stack;

public class Ques_289 {
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
        sort(st);
        System.out.print("Sorted Stack = ");
        System.out.println(st);
        sc.close();
    }

    public static void sort(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        int a = st.pop();
        sort(st);
        insert(st, a);
        return;
    }

    public static void insert(Stack<Integer> st, int x) {
        if (st.size() == 0 || st.peek() < x) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insert(st, x);
        st.push(temp);
        return;
    }
}
