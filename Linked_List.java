// ...............................Manuall method to create linked list ....................................................

// public class Linked_List {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static void Print(Node head) {
//         if (head == null) {
//             return;
//         } else {
//             System.out.print(head.data + " ");
//             Print(head.next);
//         }
//     }

//     public static void main(String[] args) {
//         Node a = new Node(1);
//         Node b = new Node(2);
//         Node c = new Node(3);
//         Node d = new Node(4);
//         Node e = new Node(5);
//         Node f = new Node(6);
//         a.next = b;
//         a.next.next = c;
//         a.next.next.next = d;
//         a.next.next.next.next = e;
//         a.next.next.next.next.next = f;
//         Print(a);
//     }
// }

// ............... Creating class to create link list .................................................................

public class Linked_List {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // linked list class .....................
    public static class linkedlist {
        Node head = null;
        Node tail = null;

        // Function to add in end of linked list
        public void addlast(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
        }

        // function to print linked list ..............
        public void printl() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // function to add in front of linked list ..........
        public void addfront(int val) {
            Node Ftemp = new Node(val);
            if (head == null) {
                head = Ftemp;
                tail = Ftemp;
            } else {
                Ftemp.next = head;
                head = Ftemp;
            }
        }

        // function to insert at index ........
        public void insertl(int index, int val) {
            Node t = new Node(val);
            Node Temp = head;
            if (index == 0) {
                addfront(val);
                return;
            }
            for (int i = 0; i <= index - 1; i++) {
                Temp = Temp.next;
            }
            t.next = Temp.next;
            Temp.next = t;
        }

        // function to print element at index ............
        public void printi(int index) {
            Node ind = head;
            for (int i = 0; i < index; i++) {
                ind = ind.next;
            }
            System.out.println(ind.data);
        }

        // function to delete element at index .....
        public void delete(int index) {
            Node te = head;
            for (int i = 0; i < index - 1; i++) {
                te = te.next;
            }
            te.next = te.next.next;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.printl();
        ll.addfront(0);
        ll.printl();
        ll.insertl(2, 25);
        ll.printl();
        ll.insertl(0, 11);
        ll.printl();
        ll.printi(3);
        ll.delete(4);
        ll.printl();
    }
}
