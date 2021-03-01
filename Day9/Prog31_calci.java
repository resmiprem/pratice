package Day9;

import java.util.Scanner;

public class Prog31_calci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int f,a,b;
		System.out.print("Enter 1 for addition\nEnter 2 for subtraction\nEnter three for multiplication\nEnter four for division");
		f=s.nextInt();
		System.out.println("Enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		switch(f)
		{
			case 1:
				System.out.println("Sum of two number is "+(a+b));
				break;
			case 2:
				System.out.println("subraction of two number is "+(a-b));
				break;
			case 3:
				System.out.println("Multiplication of two number is "+(a*b));
				break;
			case 4:
				System.out.println("Division of two number is "+(a/b));
				break;
				default:
					System.out.println("Enter a valid no");
		}

	}

}
