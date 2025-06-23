
public class Practise {
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

        public void printl() {
            Node te = head;
            while (te != null) {
                System.out.print(te.data + " ");
                te = te.next;
            }
            System.out.println();
        }

        public int size() {
            Node te = head;
            int count = 0;
            while (te != null) {
                count++;
                te = te.next;
            }
            return count;
        }

        public void addf(int val) {
            Node Tem = new Node(val);
            if (head == null) {
                addl(val);
                return;
            } else {
                Tem.next = head;
                head = Tem;
            }
        }

        public void printAtIndex(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

        public void delete(int index) {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        public void insert(int index, int val) {
            Node temp = head;
            Node temph = new Node(val);
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temph.next = temp.next;
            temp.next = temph;

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
        ll.printl();
        ll.addf(0);
        ll.printl();
        System.out.println(ll.size());
        ll.printAtIndex(4);
        ll.delete(3);
        ll.printl();
        ll.insert(3, 3);
        ll.printl();

    }
}