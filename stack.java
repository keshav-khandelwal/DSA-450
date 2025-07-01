// ...................................... BASIC STACK OPERATIONS
// ....................................................
// import java.util.Stack;

// public class stack {

// public static void main(String[] args) {
// Stack<Integer> stack = new Stack<>();
// System.out.println(stack.isEmpty());
// stack.push(1);
// stack.push(2);
// stack.push(3);
// stack.push(4);
// stack.push(5);
// stack.push(6);
// stack.push(7);
// System.out.println(stack);
// System.out.println(stack.isEmpty());
// System.out.println(stack.peek());
// System.out.println(stack.pop());
// System.out.println(stack);
// System.out.println(stack.size());
// for (int i = stack.size() - 1; i >= 0; i--) {
// System.out.print(stack.get(i) + " , ");
// }
// System.out.println();
// System.out.println(stack.get(3));
// }

// }

// .................................... Copy Stack
// ...............................

// import java.util.Stack;

// public class stack {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// st.push(1);
// st.push(2);
// st.push(3);
// st.push(4);
// st.push(5);
// st.push(6);
// st.push(7);
// System.out.println("orignal st");
// System.out.println(st);
// Stack<Integer> rt = new Stack<>();
// while (st.size() > 0) {
// rt.push(st.pop());
// }
// System.out.println("Reverse of orignal stack st");
// System.out.println(rt);
// Stack<Integer> vt = new Stack<>();
// while (rt.size() > 0) {
// vt.push(rt.pop());
// }
// System.out.println("Copy of orignal stack st");
// System.out.println(vt);
// while (vt.size() > 0) {
// st.push(vt.pop());
// }
// System.out.println("Reverse of st int st ");
// System.out.println(st);
// }

// }

// ...........insert at index ...............................

// import java.util.Scanner;
// import java.util.Stack;

// public class stack {

// public static void main(String[] args) {
// Stack<Integer> st = new Stack<>();
// Scanner sc = new Scanner(System.in);
// st.push(1);
// st.push(2);
// st.push(3);
// st.push(4);
// st.push(5);
// st.push(6);
// System.out.println(st);
// int n = sc.nextInt();
// Stack<Integer> rt = new Stack<>();
// while (st.size() > n) {
// rt.push(st.pop());
// }
// System.out.println(st);
// System.out.println(rt);
// st.push(0);
// while (rt.size() > 0) {
// st.push(rt.pop());
// }
// System.out.println(st);
// stackreverse(st);
// System.out.println(st);
// insertatindex(st, n);
// System.out.println(st);
// displayst(st);

// }

// public static void stackreverse(Stack<Integer> st) {
// if (st.isEmpty())
// return;
// int top = st.pop();
// stackreverse(st);
// insert(st, top);
// }

// public static void insert(Stack<Integer> st, int top) {
// if (st.isEmpty()) {
// st.push(top);
// return;
// }
// int prev = st.pop();
// insert(st, top);
// st.push(prev);

// }

// public static void insertatindex(Stack<Integer> st, int n) {
// if (n == 0) {
// st.push(1);
// return;
// }
// int top = st.pop();
// insertatindex(st, n - 1);
// st.push(top);
// }

// public static void displayst(Stack<Integer> st) {
// if (st.size() == 0) {
// System.out.println();
// return;
// }
// int top = st.pop();
// System.out.print(top + " , "); // this prints stack in reverse
// displayst(st);
// System.out.print(top + " , "); // this prints the stack
// st.push(top);
// }

// }
// ......................... Reverse the stack and display the stack using recurssion ..................
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Toal not of elements in stack = ");
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