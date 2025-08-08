public class Ques_166 {
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
        System.out.println(c.right);
        System.out.print("Dispaly Tree : ");
        display(root);
        System.out.println("Height of Tree : "+height(root));
    }
    public static void display(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        if(root.left!=null){System.out.print(root.left.data+" , ");}
        if(root.right!=null)System.out.print(root.right.data);
        System.out.println();
        display(root.left);
        display(root.right);
    }
    
    public static int height(node root){
        if(root==null){
            return 0;
        }
        if(root.left == null && root.right==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}
