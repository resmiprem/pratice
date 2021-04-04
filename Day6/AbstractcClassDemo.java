package Day6;

public class AbstractcClassDemo {
	

		public static void main(String[] args)throws Exception {
			
	fan f=container.StateChange("Day6.OnState");
	f.changeState();
		}

	}
	class container
	{
		public static fan StateChange(String classname)throws Exception
		{
			fan f=new fan();
			State state=(State)Class.forName(classname).newInstance();
			f.s=state;
			return f;
		}
	}
	class fan
	{State s;
		public void changeState()
		{
			System.out.println(s);
		}
	}


	abstract class State
	{
		
	}
	class OnState extends State
	{
		
	}
	class OffState extends State
	{
		
	}
	class MediumState extends State
	{
		
	}


