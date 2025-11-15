package LSQ;

public class LL2 {
    private Node head;
    private Node tail;
    private int size;
    public LL2(){
        this.size=0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }


    }
    public void inf(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size+=1;
        if (tail == null){
            tail = head;
        }
    }

    public void display(){
        if (head == null){
            System.out.println("Empty");
        }
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");

    }



}


