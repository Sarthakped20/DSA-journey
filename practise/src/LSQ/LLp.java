package LSQ;

public class LLp {
    private Node head;
//    this that a linkedlist contains
    private Node tail;
    private int size;
    public LLp(){
        this.size=0;
    }

  private class Node{
      public Node(int val) {
          this.val = val;
      }

      public Node (int val , Node next){
          this.val=val;
          this.next=next;
      }

      private  int val;
      private Node next;
  }
  public void insertatf(int val){
      Node node = new Node(val);
      node.next = head;
      head = node;
      size+=1;

      if (tail==null){
          tail=head;
      }
  }
  public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
      System.out.print("END");
  }
}
