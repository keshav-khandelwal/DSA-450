// // Importing the necessary Java utility classes
// import java.util.*;

// public class queue {
//     public static void main(String[] args) {
        
//         // Creating a Queue of Integer type using LinkedList implementation
//         Queue<Integer> q = new LinkedList<>();
        
//         // Adding elements to the queue (enqueue operation)
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);

//         // Printing the entire queue
//         // Output: [1, 2, 3, 4, 5, 6, 7]
//         System.out.println("Initial Queue: " + q);

//         // Removing the head (front) of the queue (dequeue operation)
//         // This removes 1 (FIFO)
//         q.remove(); 

//         // Alternative to remove(): q.poll(); — safer as it returns null if empty
//         // But here, remove() is used and it's safe since queue isn't empty

//         // Output after removing head
//         // Output: [2, 3, 4, 5, 6, 7]
//         System.out.println("After removing head (1): " + q);

//         // Adding a new element to the end of the queue
//         q.add(1); // 1 goes to the rear

//         // Output: [2, 3, 4, 5, 6, 7, 1]
//         System.out.println("After adding 1 again: " + q);

//         // Viewing the head element using element()
//         // Returns the front of the queue without removing it
//         // Throws exception if queue is empty
//         System.out.println("Front using element(): " + q.element()); // Output: 2

//         // Viewing the head using peek()
//         // Same as element(), but returns null if queue is empty (safer)
//         System.out.println("Front using peek(): " + q.peek()); // Output: 2

//         // Getting the current size of the queue
//         System.out.println("Size of queue: " + q.size()); // Output: 7

//         // Checking if the queue is empty
//         System.out.println("Is queue empty? " + q.isEmpty()); // Output: false
//     }
// }



// ............................ print Queue using extra Queue ..................................


import java.util.*;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Queue : ");
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<n;i++){
            int a =sc.nextInt();
            q.add(a);
        }
        Queue<Integer> q2 = new LinkedList<>();
        while(q.size()!=0){
            int b = q.remove();
            System.out.print(b+" ");
            q2.add(b);
        }
        q=q2;
        System.out.println(); 
        System.out.println(q);
        sc.close();
    }
}