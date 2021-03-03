package Day11;
import java.util.Scanner;
public class Prog8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,j=0;
		int mark[]=new int[10];
		double avg=0;
while(i<10)
{System.out.println("Enter the marks of 5 subject");
for(j=0;j<5;j++){
		try
{
	mark[i]=Integer.parseInt(s.next());
}
catch(NumberFormatException e)
{
	System.out.println("enter a valid integer value");
	mark[i]=s.nextInt();
}
avg+=mark[i];

}

System.out.println("average of student "+i+" is"+(avg/5));
avg=0;
i++;
}
	}

}
