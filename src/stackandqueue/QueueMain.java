package stackandqueue;

public class QueueMain
{
	public static void main(String[] args) {
		System.out.println("Welcome to  Queue Program");
		
		Queue queue = new Queue();
	
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		

        if (queue.isEmpty())
        {
            System.out.print("The queue is empty");
        }
        else 
        {
            System.out.print("The queue is not empty");
        }
		

		queue.print();
	}

}