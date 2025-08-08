
// ...................................  Level order Traversal Using pre order traversal ...........................................

// public class Ques_164 {
//     public static class node{
//         int data;
//         node left;
//         node right;
//         node(int data){
//             this.data =data;
//         }
//     }
//     public static void main(String[] args) {
//         node root =new node(10);
//         node a = new node(11);
//         node b = new node(12);
//         node c = new node(13);
//         node d = new node(14);
//         node e = new node(15);
//         node f = new node(16);
//         node g = new node(17);
//         node h = new node(18);
//         root.left=a;
//         root.right=b;
//         b.left=c;
//         b.right =f;
//         a.left=d;
//         a.right=e;
//         d.left=g;
//         d.right=h;
//         int height =height(root);
//         int level = height+1;
//         for(int i =1;i<=level;i++){
//             printNthLevel(root,i);
//             System.out.println();
//         }
//     }
//     public static int height(node root){
//         if(root==null){
//             return 0;
//         }
//         if(root.left==null && root.right==null){
//             return 0;
//         }
//         return 1+Math.max(height(root.left),height(root.right));
//     }
//     public static void printNthLevel(node root, int level){
//         if(root==null){
//             return;
//         }
//         if(level==1){
//             System.out.print(root.data+" ");
//             return;
//         }
//         printNthLevel(root.left, level-1);
//         printNthLevel(root.right, level-1);
//     }
// }


//  .......................... LEVEl order traversal using queue ..............[ iterative method  ]................................

// import java.util.*;
// public class Ques_164 {
//     public static class node{
//         int data;
//         node left;
//         node right;
//         node(int data){
//             this.data =data;
//         }
//     }
//     public static void main(String[] args) {
//         node root =new node(10);
//         node a = new node(11);
//         node b = new node(12);
//         node c = new node(13);
//         node d = new node(14);
//         node e = new node(15);
//         node f = new node(16);
//         node g = new node(17);
//         node h = new node(18);
//         root.left=a;
//         root.right=b;
//         b.left=c;
//         b.right =f;
//         a.left=d;
//         a.right=e;
//         d.left=g;
//         d.right=h;
//         levelorder(root);
//     }
//     public static void levelorder(node root){
//         Queue<node> queue = new LinkedList<>();
//         queue.add(root);
//         while(queue.size()!=0){
//             node current = queue.remove();
//             System.out.print(current.data+" ");
//             if(current.left!=null) queue.add(current.left);
//             if(current.right!=null) queue.add(current.right);
//         }
//     }
    
// }



//  ........................ Return in format of    ArrayList<ArrayList<Integer>> .......................................

import java.util.*;
public class Ques_164 {
    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data =data;
        }
    }
    public static void main(String[] args) {
        node root =new node(10);
        node a = new node(11);
        node b = new node(12);
        node c = new node(13);
        node d = new node(14);
        node e = new node(15);
        node f = new node(16);
        node g = new node(17);
        node h = new node(18);
        root.left=a;
        root.right=b;
        b.left=c;
        b.right =f;
        a.left=d;
        a.right=e;
        d.left=g;
        d.right=h;
        List<List<Integer>> result = levelorder(root);
        System.out.println(result);
        
    }
    public static List<List<Integer>> levelorder(node root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<node> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
            int size= queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                node current = queue.remove();
                level.add(current.data);
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
            result.add(level);
        }
        return result;
    }
    
}

