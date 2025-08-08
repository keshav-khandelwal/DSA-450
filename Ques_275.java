
// ......................... Implementation of stacks using arrays ...............................................
// import java.util.*;

// public class Ques_275 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         stack st = new stack();
//         int a = sc.nextInt();
//         st.push(a);
//         int p = sc.nextInt();
//         st.push(p);
//         int q = sc.nextInt();
//         st.push(q);
//         int r = sc.nextInt();
//         st.push(r);
//         int s = sc.nextInt();
//         st.push(s);

//         int b = st.peek();
//         System.out.println(b);
//         int c = st.pop();
//         System.out.println(c);
//         int d = st.peek();
//         System.out.println(d);
//         System.out.println(st.isEmpty());
//         System.out.println(st.isFull());
//         System.out.println(st.size());
//         st.display();

//     }

//     public static class stack {
//         int[] arr = new int[20];
//         int index = -1;

//         public void push(int a) {
//             if (isFull() == true) {
//                 System.out.println("Stack Overflow");
//                 return;
//             }
//             arr[++index] = a;
//         }

//         public int peek() {
//             if (isEmpty() == true) {
//                 System.out.println("Stack underflow");
//                 return -1;
//             }
//             return arr[index];
//         }

//         public int pop() {
//             if (isEmpty() == true) {
//                 System.out.println("Stack underflow");
//                 return -1;
//             }
//             return arr[index--];
//         }

//         public boolean isEmpty() {
//             if (index == -1) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }

//         public boolean isFull() {
//             if (index + 1 == arr.length) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }

//         public int size() {
//             return index + 1;
//         }

//         public void display() {
//             System.out.print("[ ");
//             for (int i = 0; i <= index; i++) {
//                 System.out.print(arr[i]);
//                 if (i < index)
//                     System.out.print(", ");
//             }
//             System.out.println(" ]");
//         }
//     }
// }

// .......................... Linked List Implementation of stack .................................

public class Ques_275 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class stack {
        Node head = null;
        int size = 0;

        public void push(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++;
            
        }

        public int pop() {
            if (head == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int a = head.data;
            head = head.next;
            size--;
            return a;
        }

        public int peek() {
            if (head == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty() {
            if (head == null) {
                return true;
            } else {
                return false;
            }
        }

        public int size() {
            return size;
        }

        public void display() {
            if (head == null) {
                System.out.println("[]");
                return;
            }
            Node temp = head;
            System.out.print("[ ");
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) {
                    System.out.print(" , ");
                }
                temp = temp.next;
            }
            System.out.println(" ]");
        }

    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.size());

    }
}
