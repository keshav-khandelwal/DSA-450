// .......................creating without the use of constructor  ...........................
// public class Tree_Basics {
//     public static class node{
//         int val;
//         node right;
//         node left;

//     }
//     public static void main(String[] args) {
//         node root = new node();
//         root.val=10;
//         System.out.println(root.val);

//     }
// }


//...................... constructing with use of constructor ...............................................

public class Tree_Basics {
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
        System.out.print("Dspaly Tree : ");
        display(root);
        System.out.print("Preorder Display : ");
        preorder(root);
        System.out.println();
        System.out.println("size of tree: "+size(root));
        System.out.println("Sum of Nodes Of Tree : "+sumNodes(root));
        System.out.println("Node with Maximum Value: "+max(root));
        System.out.println("Height of Tree : "+height(root));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder Traversal : ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder traversal: ");
        postorder(root);
        System.out.println();

    }
    //..............................To Display Tree ........................................
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
    //..................................... Size of tree ...........................
    public static int size(node root){
        if(root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }
    // ...................................... SUM of nodes  ...........................................
    public static int sumNodes(node root){
        if(root==null){
            return 0;
        }
        return root.data+sumNodes(root.left)+sumNodes(root.right);
    }
    // ............................... Max in tree ..............................................
    public static int max(node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int a = root.data;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }
    // ...................................... Height of tree .......................................
    public static int height(node root){
        if(root==null){
            return 0;
        }
        if(root.left == null && root.right==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }



    //......................................... Preorder Traversal ....................................
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //..................................... INorder Traversal ..........................................
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //............................................. POSTORDER Traversal
    public static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}
