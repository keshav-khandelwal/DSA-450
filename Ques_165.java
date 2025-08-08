//........................................ Reverse the level order traversal using stack .................................
import java.util.*;
public class Ques_165 {
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
        levelorder(root);
    }
    public static void levelorder(node root){
        Queue<node> queue = new LinkedList<>();
        Stack<Integer>st = new Stack<>();
        queue.add(root);
        while(queue.size()!=0){
            node current = queue.remove();
            st.push(current.data);
            if(current.right!=null) queue.add(current.right);
            if(current.left!=null) queue.add(current.left);
        }
        while(st.size()!=0){
            System.out.print(st.pop()+" ");
        }
    }
    
}
