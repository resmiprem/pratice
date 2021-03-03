package Day8;

public class Prog6_StaticBlock {
	static {
        System.out.println("static block executed");
    }
 
   
    public static void fun() {
        System.out.println("fun executed");
    }
 
    public static void main(String args[ ])  {
        System.out.println("main started");
        fun();
    } 
}
