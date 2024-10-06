class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(){};
}

class Stack{
    Node top;
    void push(int elem){
        Node e = new Node(elem);
        if(top == null){
            top  = e;
        }
        else{
             e.next =top;
            top =e;
        }
    }


    int pop(){
        int elem  = top.data;
        top = top.next;
        
        return elem;
    }
    public void display(){
        Node current = top;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}



public class StackUsingLinkedList {
    public static void main(String [] args){
        Stack s = new Stack();
        s.push(70);
        s.push(50);
        s.push(500);
        s.pop();
        s.display();

    }
    
}
