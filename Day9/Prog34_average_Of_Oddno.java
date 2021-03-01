package Day9;

import java.util.Scanner;

public class Prog34_average_Of_Oddno {

	public static void main(String[] args) {
		int n,odd=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range");
	n=s.nextInt();
		//System.out.print("odd Numbers from 1 to "+n+" are: ");
		for (int i = 1; i <= n; i++) {
		   if (i % 2 != 0) {
			//System.out.print(i + " ");
			   odd+=i;
			   count++;
		   }
		}
		System.out.println("Average of odd number is "+(odd/count));
	}

}
