package Day8;

public class Prog2 {

	public static void main(String[] args) {
		complexNumber c1=new complexNumber(6.7,5);
		
		complexNumber c2=new complexNumber(7.6,8);
		
		complexNumber temp=c2.sum(c1,c2);
		System.out.println("sum is="+temp.real+"+"+temp.img+"i");
	}

}
class complexNumber
{
	double real,img;
	complexNumber()
	{
		
	}
	public complexNumber(double real,double img)
	{this.real=real;
	this.img=img;
		
	}
	public complexNumber sum(complexNumber c1,complexNumber c2)
	{
		complexNumber temp=new complexNumber();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	
}