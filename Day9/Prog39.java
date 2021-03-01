package Day9;

import java.util.Scanner;

public class Prog39 {

	public static void main(String[] args) {
		 int num ,i=1;
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter a no");
		 num=s.nextInt();
	       while(i<=10)
	        {
	            System.out.printf("%d * %d = %d \n", num, i, num * i);
	            i++;
	        }
	}

}
