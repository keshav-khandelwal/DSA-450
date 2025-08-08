
//.................................... Array implementation of QUEUE  ..............................


// public class Ques_276 {
//     public static class queuea{
//         int[] arr =new int[100];
//         int f=0;
//         int r =0;
//         //int[] arr;                                     // if want to create as constructor
//         // public queuea(int size) {
//         // arr = new int[size];
//         // }
        
//         public void add(int a){                       
//             arr[r]=a;
//             r++;
//         }
//         public int remove(){
//             if(f==r){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int val = arr[f];
//             f++;
//             return val;
//         }
//         public int element(){
//             if(f==r){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int val = arr[f];
//             return val;
//         }
//         public int size(){
//             return r-f;
//         }
//         public boolean isEmpty(){
//             if(f==r){
//                 return true;
//             }
//             return false;

//         }
//         public void printq(){
//             for(int i =f;i<r;i++){
//                 System.out.print(arr[i]+" ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         queuea q = new queuea();
//         //queuea q = new queuea(200); // queue with capacity 200                            // to create constructor 
    
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);
    
//     System.out.println(q.remove()); 
//     System.out.println(q.element()); 
//     System.out.println(q.size()); 
//     System.out.println(q.isEmpty()); 
//     q.printq();
//     }
// }
 

// ......................................  LINKEDLIST implementation of Queue   ..........................................



// public class Ques_276{
//     public static class node{
//         int data;
//         node next;
//         node(int data){
//             this.data =data;
//             this.next =null;
//         }
//     }
//     public static class queueA{
//         node head =null;
//         node tail = null;
//         int size=0;
//         public void add(int a){
//             node temp = new node(a);
//             if(head==null){
//                 tail = head = temp;
//                 size++;
//             }else{
//             tail.next = temp;
//             tail = temp;
//             size++;
//             }
//         }
//         public int element(){
//             if(head ==null){
//                 return -1;
//             }
//             int val = head.data;
//             return val;
//         }
//         public int remove(){
//             if(head==null){
//                 return -1;
//             }
//             int val = head.data;
//             head = head.next;
//             size--;
//             return val;
//         }
//         public int size(){
//             return size;
//         }
//         public boolean isEmpty(){
//             if(size==0){
//                 return true;
//             }else{
//                 return false;
//             }
//         }
//         public void printq() {
//             node temp = head;
//             while(temp != null) {
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     }
    
//     public static void main(String[] args) {
//         queueA q = new queueA();
        
    
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);
    
//     System.out.println(q.remove()); 
//     System.out.println(q.element()); 
//     System.out.println(q.size()); 
//     System.out.println(q.isEmpty()); 
//     q.printq();
        
//     }
// }


// ....................................  STACK implementation of Queue  .........................................

import java.util.*;
public class Ques_276{
    public static class queueA{
        Stack<Integer> qu1 = new Stack<>();
        Stack<Integer> qu2 = new Stack<>();
        public void add(int a ){
            qu1.push(a);
        }
        public int size(){
            return qu1.size();
        }
        public boolean isEmpty(){
            if(qu1.size()==0){
                return true;
            }else{
                return false;
            }
        }
        public int element(){
            if(qu1.size()==0){
                System.out.println("Queue is empty");
                return -1;
            }
            while(qu1.size()>0){
                qu2.push(qu1.pop());
            }
            int val =qu2.peek();
            while(qu2.size()>0){
                qu1.push(qu2.pop());
            }
            return val;
        }
        public int remove(){
            if(qu1.size()==0){
                System.out.println("Queue is empty");
                return -1;
            }
            while(qu1.size()>0){
                qu2.push(qu1.pop());
            }
            int val =qu2.peek();
            qu2.pop();
            while(qu2.size()>0){
                qu1.push(qu2.pop());
            }
            return val;
        }
        public void printq(){
            System.out.println(qu1);
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
    
        System.out.println(q.remove()); 
        System.out.println(q.element()); 
        System.out.println(q.size()); 
        System.out.println(q.isEmpty()); 
        q.printq();
        
    }
}