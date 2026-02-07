package LSQ;


class stack{
    private int []arr;
    private int size;
    private int top;


    stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int val){
        if (top == size-1){
            System.out.println("Stack Overflow! ");
            return;
        }
        top++;
        arr[top]=val;
    }

    public int pop(){
        if (top ==-1){
            System.out.println("Stack Underflow! ");
            return -1;
        }
        int removed = arr[top];
        top--;
        return removed;
    }
    public int peek(){
        if (top==-1){
            System.out.println("Stack is Empty! ");
        }
        return arr[top];
    }

    public void display(){
        for (int i =0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class StackBuild {

    public static void main(String[] args) {
        stack s = new stack(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        System.out.println("Pooped: "+s.pop());
        s.display();
        System.out.println("Peek: "+s.peek());
        s.push(6);
        s.display();
        s.push(7);
    }
}
