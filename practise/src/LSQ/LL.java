package LSQ;
import java.util.*;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public int deleteatf(){
        int val = head.val;
        head = head.next;
        if (head == null){
            tail = null;

        }
        size--;
        return val;
    }
    public void insertatL(int val){
        if (tail == null){
            insertatF(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }
    public void insertatF (int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size += 1;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }


    }

}
