package Day8;

public class Prog7 {

	public static void main(String[] args) {
	
		finalref fr=new finalref(7);
		System.out.println("before change no is "+fr.no);
		fr.no=9;
		System.out.println("after change no is "+fr.no);
	}

}
class finalref{
	int no;
	finalref(int no)
	{
	this.no=no;	
	}
}