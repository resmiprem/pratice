package Day14;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ObserverDemo {

	public static void main(String[] args)throws Exception {
	FireAlarm fa=new FireAlarm();
	Student s=new Student();
	Teacher t=new Teacher();
	 
			fa.addObserver(t);   
		fa.addObserver(s);  
		fa.SetAlarm();
		
}
}

class FireAlarm extends Observable
{
	public void SetAlarm()
	{
		setChanged();
		notifyObservers("fire in the mountain run run run..................");
	}
}
class Student implements Observer
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
class Teacher implements Observer
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
