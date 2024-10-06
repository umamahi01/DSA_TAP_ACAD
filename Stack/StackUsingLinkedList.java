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
    void Push(int elem){
        Node e = new Node(elem);
        if(top == null){
            top  = e;
        }
        else{
            Node temp =top.next;
            top = temp;
        }
    }


    int pop(){
        int elem  = top.data;
        Node prev = top;
        prev.next =null;
        
        top = top.next;
        
        return elem;
    }

}



public class StackUsingLinkedList {
    public static void main(String [] args){

    }
    
}
