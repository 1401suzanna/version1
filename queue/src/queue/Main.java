package queue;


public class Main {

	public static void main(String args[])
	{
		 QueueInterface QArray= new QueueArrays();
		 QueueInterface QArray1= new QueueArrayList();
		
		System.out.println("Queue Using Array");
		QArray.Enqueue(10);
		QArray.Enqueue(20);
		QArray.Enqueue(30);
		/*QArray.Enqueue(70);*/
		QArray.Dequeue();
		QArray.Dequeue();
		QArray.Display();
		System.out.println("--------------------------------------");
		System.out.println("Queue Using ArrayList");
		QArray1.Enqueue(10);
		QArray1.Enqueue(20);
		QArray1.Enqueue(30);
		/*QArray.Enqueue(70);*/
		QArray1.Dequeue();
		QArray1.Display();
	}
	
}
