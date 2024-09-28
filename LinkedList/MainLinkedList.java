

class IndexOutofRange extends IndexOutOfBoundsException{
    public IndexOutofRange(){
        super("given index is not there in the list");
    }
}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
    
}


class LinkedList{
    
    //points to first element of the list
    Node head;
    
    //prints the element in the linkedlsit
    void printLinkedList(){
        Node current_Node = head;
        while(current_Node!= null){
            System.out.print(current_Node.data+" ");
            current_Node = current_Node.next;
        }
    }

    //add a element into the list;
    void add(int data){
        Node  e = new Node(data);;
        if(head==null){
           
            head = e;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = e;
        }
    }

    //add element at first
    void addFirst(int data){
        Node e = new Node(data);
        if(head== null){
            head = e;
        }
        else{
           
            e.next = head;
            head = e;

        }

    }

    //insert data at a given index handles null pointer exception
    void add(int index,int data) throws IndexOutofRange{
       try{
        Node e = new Node(data);
        if(index ==0){
            addFirst(data);
        }
        else{
        
            Node current = this.head;
            int count =0;
            while(count<index-1){
                current = current.next;
                count++;
            }
            e.next = current.next;
            current.next =e;
        }
       }
       catch(NullPointerException e){
            throw new IndexOutofRange();
       }
    }

    //add the array of elements into the lsit
    void addAll(int [] elements){
            for(int element:elements){
                add(element);
            }
    }


    //removes first element from the list
    int removeFirst(){
        int data=0;
        if(head == null){
        }
        else if(head.next == null)
        {
            data = head.data;
                head = null;
        }
        else if(head.next != null){
            data = head.data;
            Node current = head;
            head = head.next;
            current.next = null;
        }

        return data;

    }

    
    //removes last element from the list
    int removeLast(){
        int data= 0;
        if(head == null){}
        else if(head.next == null){
            data= head.data;
            head = null;
        }
        else if(head != null){
            
            Node current = head;
        
        while(current.next !=null){
            current = current.next;
        }
        data = current.data;
        current = head;
        while(current.next.next != null){
            
            current = current.next;
        }
        current.next =null;
        }
        return data;
    }


    int indexOf(int element){
       int count=0;
       Node current =head;
       while(current.next!=null && current.data != element) {
            current= current.next;
            count++;
       }
       return count>=0?count:-1;
    }




}

class MainLinkedList{
   
    public static void main(String [] args){
       
        LinkedList list = new LinkedList();
        int arr []= {3,4,5,6};
        list.addAll(arr);
        list.add(30);//0
        list.add(40);//1
        list.add(60);//2
        list.add(70);//3
        list.addFirst(100);
        list.add(2, 900);
        int res =list.indexOf(70);
        System.out.println(res);
        list.printLinkedList();
    
    
    }
}