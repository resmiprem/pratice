package Day9;
import java.util.Scanner;
public class Prog29_vowel {

	public static void main(String[] args) {
		char a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character");
		a=s.next().charAt(0);
		switch(a)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println(a+" is a vowel");break;
		default:System.out.println(a+" is not a vowel");	
		}
	}

}
