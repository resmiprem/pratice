package Day9;

public class Prog54_Interface implements example {

	public static void main(String[] args) {
		example x=new Prog54_Interface();
		System.out.println("interface value:"+x.integer);
	}

}
interface example
{
	int integer=10;
}