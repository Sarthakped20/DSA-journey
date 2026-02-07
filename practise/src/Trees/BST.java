package Trees;


class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
    }
}
public class BST {
    Node root;

    public void insert(int data){
        root = insertrec(root,data);
    }

    public Node insertrec(Node node,int data){
//        if there are no elements then the node will be considered as the root node
        if (node == null){
//            check if the tree is empty or not.
            return new Node(data);
        }
//      This loop check the current value the root node and based on that:
        if (data< node.data){
//            if its less than root then added to left branch
            node.left=insertrec(node.left,data);
//            if it's greater than root than added to right
        } else if (data> node.data) {
            node.right=insertrec(node.right,data);
        }

        return node;
    }
    public void preorder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(Node node){
        if (node == null){
            return;
        }
        inorder(node.right);
        System.out.print(node.data+" ");
        inorder(node.left);
    }

    public void postorder(Node node){
        if (node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    public int count (Node node){
        if (node == null ){
            return 0;
        }
        return 1+count(node.left)+count(node.right);
    }
    public boolean search(Node node ,int key){
        if (node == null){
            return false;
        }
        if (key == node.data){
            return true;
        } else if (key< node.data) {
            return search(node.left,key);
        }else if (key> node.data) {
            return search(node.right,key);
        }
        else {
            return false;
        }
    }
    public int finmin(Node node){

        while (node.left != null){
            node = node.left;

        }return node.data;
    }
    public int findmax(Node node){
        while (node.right!=null){
            node = node.right;
        }
        return node.data;
    }

    public int sum(Node node){
        if (node == null) return 0;
        return node.data+sum(node.left)+sum(node.right);

    }
    public int prod(Node node){
        if (node == null)return 1;
        return node.data*prod(node.left)*prod(node.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int [] arr = {8,4,6,9,12,32,1,5,15};
        for (int num :arr) {
            tree.insert(num);
        }

        System.out.println("pre-order: ");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("in-order: ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("post-order: ");
        tree.postorder(tree.root);
        System.out.println();
        System.out.println("Total nodes: " + tree.count(tree.root));
//        System.out.println();
        System.out.println("Searching 9 in tree : "+tree.search(tree.root,9));
//        System.out.println();
        System.out.println("Finding smallest element in tree: "+tree.finmin(tree.root));
//        System.out.println();
        System.out.println("Maximum element in tree: "+tree.findmax(tree.root));
//        System.out.println();
        System.out.println("Sum of all nodes in tree: "+tree.sum(tree.root));
//        System.out.println();
        System.out.println("Product of all nodes in tree: "+tree.prod(tree.root));
    }
}
