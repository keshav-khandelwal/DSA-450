// ............................. Preorder iteration using recussion and iteration ......................................................
import java.util.*;
public class Ques_170 {
    public static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data=data;
        }

    }
    public static void main(String[] args) {
        node root = new node(10);
        System.out.println(root.data);
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
        preorderR(root);
        System.out.println();
        preorderI(root);
    }
    public static void preorderR(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorderR(root.left);
        preorderR(root.right);
    }
    public static void preorderI(node root){
        Stack<node> st = new Stack<>();
        st.push(root);
        while(st.size()!=0){
            node curr=st.pop();
            System.out.print(curr.data+" ");
            if(curr.right!=null) st.push(curr.right);
            if(curr.left!=null) st.push(curr.left);
        }
    }
}
