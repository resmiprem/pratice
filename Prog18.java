package ey;
import java.util.Scanner;
public class Prog18 {
	 private static final String[] numNames = {
			    "Zero",
			    " one",
			    " two",
			    " three",
			    " four",
			    " five",
			    " six",
			    " seven",
			    " eight",
			    " nine"};

	public static void main(String[] args) {
		int n,temp,r,c=0;
		String str[]=new String[7];
Scanner s=new Scanner(System.in);
n=s.nextInt();
temp=n;
while(n>0)
{
	r=n%10;
	str[c]=numNames[r];
	n=n/10;
	c++;
}
for(int i=(c-1);i>=0;i--)
{
	System.out.print(str[i]+" ");
}
	}

}
