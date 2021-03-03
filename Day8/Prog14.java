package Day8;

public class Prog14 {

	public static void main(String[] args) {
	
Marks e=new Marks();
e.total();
e.display();

	}

}
class Student
{
	String name;
	int rollno;
	public Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	
}
}
class Exam extends Student
{

	int sub1;
int sub2;
int sub3;

	public Exam(int sub1,int sub2,int sub3)
	{super("resmi",111);
		this .sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
}
class Marks extends Exam
{
	int totalmarks;
	Marks()
	{
		super(90,89,97);
	}
	public void display()
	{
		
		System.out.println("name of the student:"+super.name);
		System.out.println("rollno of the student:"+super.rollno);
		System.out.println("totalmark of the student:"+totalmarks);
	}
	public void total() {
		totalmarks=sub1+sub2+sub3;
		//System.out.println(totalmarks);
	}	
}