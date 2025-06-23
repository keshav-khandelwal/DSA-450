public class Ques_135 {
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
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void moveLast() {
            if (head == null || head.next == null) {
                return;
            }
            Node lastsec = head;
            while (lastsec.next.next != null) {
                lastsec = lastsec.next;
            }
            Node last = lastsec.next;
            lastsec.next = null;
            last.next = head;
            head = last;
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
        ll.printl();
        ll.moveLast();
        ll.printl();

    }
}
