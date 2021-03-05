package Day13;
import java.util.Queue;
import java.util.PriorityQueue;
public class QueueCollectionDemo {

	public static void main(String[] args) {
		Queue<Customers> q=new PriorityQueue<>((o1,o2)->{return o2.compareTo(o1);});
		Customers customer1=new Customers("ramu"); 
		Customers customer2=new Customers("somu");
		Customers customer3=new Customers("damu");
		Customers customer4=new Customers("yamu");
		q.add(customer1);
		q.add(customer2);
		q.add(customer3);
		q.add(customer4);
		System.out.println("Queue Elements before modifications:"+q);
		System.out.println("Head of the Queue Elements:"+(q.element()));
		System.out.println("Poll removes and returns the head of the queue elements:"+q.poll());
		System.out.println("After poll the head of the queue elements:"+q.peek());
		System.out.println("Queue Elements after modification:"+q);
	}

}
class Customers implements Comparable<Customers>{
	String name;
	public Customers(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return "customername:"+name;
	}
	@Override
	public int compareTo(Customers o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}