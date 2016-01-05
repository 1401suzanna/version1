package queue;

import java.util.ArrayList;

public class QueueArrayList implements  QueueInterface{

	ArrayList QArray=new ArrayList();
	@Override
	public void Enqueue(int data) {
		// TODO Auto-generated method stub
		QArray.add(data);
		System.out.println("Enqueued Element: "+data);
		
	}

	@Override
	public void Dequeue() {
		// TODO Auto-generated method stub
		/* QArray.remove(0);*/
		 System.out.println("Dequeued Element: "+QArray.remove(0));
		
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Queue= "+QArray);
	}

}
