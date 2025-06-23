// ..............................................  REVERSE A LINKED LIST ITERATIVELY .......................................................
// public class Ques_128 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static class LinkedList {
//         Node head = null;
//         Node tail = null;

//         public void addl(int val) {
//             Node temp = new Node(val);
//             if (head == null) {
//                 head = temp;
//                 tail = temp;
//             } else {
//                 tail.next = temp;
//                 tail = temp;
//             }
//         }

//         public void printl() {
//             Node temp = head;
//             while (temp != null) {
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }

//         public Node reversel() {
//             Node prev = null;
//             Node curr = head;
//             while (curr != null) {
//                 Node next = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = next;
//             }
//             head = prev;
//             return head;
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.addl(1);
//         ll.addl(2);
//         ll.addl(3);
//         ll.addl(4);
//         ll.addl(5);
//         ll.addl(6);
//         ll.addl(7);
//         ll.addl(8);
//         ll.printl();
//         ll.reversel();
//         ll.printl();

//     }
// }
//............................................  REVERSE A LINKED LIST RECURSIVELY ............................................
public class Ques_128 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        public void addl(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        public void printl(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public Node reversel(Node head) {
            head = reverserecursive(head);
            return head;
        }

        public Node reverserecursive(Node head) {
            if (head.next == null) {
                return head;
            }
            Node NewHead = reverserecursive(head.next);
            head.next.next = head;
            head.next = null;
            return NewHead;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addl(1);
        ll.addl(2);
        ll.addl(3);
        ll.addl(4);
        ll.addl(5);
        ll.addl(6);
        ll.addl(7);
        ll.addl(8);
        ll.printl(ll.head);
        ll.head = ll.reversel(ll.head);
        ll.printl(ll.head);

    }
}
