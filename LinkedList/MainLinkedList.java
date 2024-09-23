class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
    
}

class LinkedList{
    Node head;
    
    void printLinkedList(){
        Node current_Node = head;
        while(current_Node != null){
            System.out.print(current_Node.data+" ");
            current_Node = current_Node.next;
        }
    }

}

class MainLinkedList{
   
    public static void main(String [] args){
       
        LinkedList list = new LinkedList();
       
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        
        list.head = n1;
        list.printLinkedList();
        
    }
}