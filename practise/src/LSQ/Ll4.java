package LSQ;

public class Ll4 {
    Node head;
    Node tail ;
    int size;

    public Ll4(){
        this.size=0;
    }
    private class Node {
        int value;
        Node next;
        public Node(int val){
            this.value=val;
        }
        public Node(Node next,int val){
            this.value=val;
            this.next=next;
        }

        public void inserf(int value){
            Node node = new Node(value);
            node.next = head;
            head = node;
            size+=1;

            if (tail.next == null){
                tail = head;
            }
        }
        public void inserL(int value){
            Node node  = new Node(value);
            if (head == null){
                head = node;
                tail = head;
            }else {
                tail.next = node;
                tail = node;

            }
            size+=1;
        }

        public int deletef(){
            if (head == null) return -1;
            int val = head.value;
            head = head.next;
            size--;
            return val;
        }

        public int dell(){
            int val = tail.value;
            Node temp = head;
            if (head == null) return -1;
            while (temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            size--;
            return val;
        }


        public boolean search (int value){

            Node temp = head;
            while (temp != null){
                if (temp.value == value){
                    return true;
                }
            }
            return false;
        }
    }


}


