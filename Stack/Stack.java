/**implementing stack using ArrayList with basic operations of push and pop 
 *  handles StackUnderFlow  exception
 */

import java.util.ArrayList;

class StackUnderFlowException extends Exception{
        public StackUnderFlowException(){
            super("no element in the stack");
        }
}
class Stack{
    ArrayList<Integer> al;
    int top;
    
    public Stack(){
        this.al = new ArrayList<Integer>();
        this.top = -1;
    }

    void push(int elem){
        al.add(elem);
    }

    int pop() throws StackUnderFlowException{
        if(al.size() == 0) {
            throw new StackUnderFlowException();
        }
        int lastIndex = al.size()-1;
        int temp = al.get(lastIndex);
        this.al.remove(lastIndex);
        return temp;
    }

}

class Main{
    public static void main(String [] args) throws Exception{
            Stack myStack = new Stack();
            myStack.push(10);
            myStack.push(20);
            myStack.push(25);
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());

    }
}