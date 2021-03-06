package stackandqueue;

public class Stack 
{
	private Node top;
	 
    public Stack() 
    {
        this.top = null;
    }
 
    public void push(int x)        
    {

        Node node = new Node();
 
        System.out.println("Inserting " + x);
 
        node.data = x;
 
        node.next = top;
 
        top = node;
    }
 
    public boolean isEmpty()
    {
        return top == null;
    }
 
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("The stack is empty");
            return -1;
        }
    }
 
    public void pop()       
    {
        if (top == null)
        {
            System.out.print("\nStack Underflow");
            return;
        }
 
        System.out.println("Removing " + peek());
 
        top = (top).next;
    }
}