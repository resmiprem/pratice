package Day14;
import java.util.Enumeration;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ObserverMultiThreadDemo {
	public static void main(String[] args)throws Exception {
		FireAlarm2 fa=new FireAlarm2();
		Student2 s=new Student2();
		Teacher2 t=new Teacher2();
	//	MultiThreadedObservable mto=new MultiThreadedObservable();
				fa.addObserver(t);
			fa.addObserver(s);  
			fa.SetAlarm();
			
	}
	}
class MultiThreadedObservable extends Observable
{

	Vector<Observer> vector	=new Vector<>();
	public synchronized void addObserver(Observer o)
	{
		vector.add(o);
	}
	public void notifyObservers(Object arg)
	{
		ExecutorService es=Executors.newFixedThreadPool(vector.size());
		Enumeration<Observer> en=vector.elements();
		while(en.hasMoreElements())
		{
			Observer obs=en.nextElement();
			es.execute(()->{obs.update(this,arg);});
		}
		es.shutdown();
	}
}

	class FireAlarm2 extends MultiThreadedObservable
	{
		public void SetAlarm()
		{
			setChanged();
			notifyObservers("fire in the mountain run run run..................");
		}
	}
	class Student2 implements Observer
	{

		@Override
		public void update(Observable o, Object arg) {
			run((String)arg);
		}
		public void run(String msg)
		{
			System.out.println("Student is running......"+msg);
		}
	}
	
	class Teacher2 implements Observer
	{

		@Override
		public void update(Observable o, Object arg) {
			run((String)arg);
		}
		public void run(String msg)
		{System.out.println("odlama vendama...................");
		System.out.println("teacher is thinking...................................");
		try {Thread.sleep(10000);}catch(Exception e) {}
			System.out.println("Teacher is running......"+msg);
		}
		
	}
