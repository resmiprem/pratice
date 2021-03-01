package Day9;

import java.util.Scanner;

public class Prog33_even_no {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range");
	n=s.nextInt();
		System.out.print("Even Numbers from 1 to "+n+" are: ");
		for (int i = 1; i <= n; i++) {
		   if (i % 2 == 0) {
			System.out.print(i + " ");
	}

}
	}
}