package Day11;

public class Prog5 {

	public static void main(String[] args) throws MyException{
	
		System.out.println("before exception");
		try{
			int a=3/0;
			throw new MyException();
		}
	finally {System.out.println("finally block");}

	
	}

}
