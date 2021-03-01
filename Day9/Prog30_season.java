package Day9;
import java.util.Scanner;
public class Prog30_season {

	public static void main(String[] args) {
		int month;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a month no");
		month=s.nextInt();
		switch(month)
		{
		case 1:
			System.out.println(month+" is a Winter season");
			break;
		case 2:
			System.out.println(month+" is a Winter season");
			break;
		case 3:
			System.out.println(month+" is a Spring season");
			break;
		case 4:
			System.out.println(month+" is a Spring season");
			break;
		case 5:
			System.out.println(month+" is a Summer season");
			break;
		case 6:
			System.out.println(month+" is a Summer season");
			break;
		case 7:
			System.out.println(month+" is a Rainny season");
			break;
		case 8:
			System.out.println(month+" is a Rainny season");
			break;
		case 9:
			System.out.println(month+" is a Autumn season");
			break;
		case 10:
			System.out.println(month+" is a Autumn season");
			break;
		case 11:
			System.out.println(month+" is a Pre-Winter season");
			break;
		case 12:
			System.out.println(month+" is a Spring season");
			break;
			default:
				System.out.println("Enter a valid no");
		}
		

	}

}
