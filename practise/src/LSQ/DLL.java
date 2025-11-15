package LSQ;

public class DLL {
    Node head;

    public void insertf(int valu){
        Node node = new Node(valu);
        node.next = head;
        node.prev = null;
        if (head != null ){
            head.prev = node;
        }

        head = node;
    }
    public void display(){
        Node node = head ;
        Node last = null;
        while (node != null){
            System.out.print(node.valu+" -> ");
            last = node;
            node  = node.next;
        }
        System.out.println("END");
        while (last != null){
            System.out.print(last.valu+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        int valu;
        Node next ;
        Node prev;

        public Node (int valu){
            this.valu = valu;
        }

        public Node(int valu , Node next , Node prev){
            this.valu = valu;
            this.next = next;
            this.prev = prev;
        }
    }
}
