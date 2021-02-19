package ey;

public class Prog24 {

	public static void main(String[] args) {
		qua q=new qua();
		qua q2=new qua(4,3,2);
		System.out.println("before modification "+q.compute(4));
		q.modify(3, 2, 1);
		System.out.println("after modification "+q.compute(4));
		
		System.out.println("parameterized contructor values "+q2.compute(4));
	}

}
class qua{
	 int a;
	 int b;
	 int c;
	 public qua()
	 {
		 this.a=1;
		 this.b=1;
		 this.c=1;
	 }
	 public qua(int a,int b,int c)
	 {
		 this.a=a;
		 this.b=b;
		 this.c=c;
	 }
	 public void modify(int a,int b,int c) {
			this.a=a;
			this.b=b;
			this.c=c;
		}

		public int compute(int x) {
			return (this.a*(x*x))+(this.b*x)+this.c;
			
		}
}