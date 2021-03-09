package ey;
import java.util.Scanner;
public class Prog13 {

	public static void main(String[] args) {
		int a[][]=new int[4][4];
		float total[]= new float[4];
		float percentage[]=new float[4];
		int c=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{System.out.println("enter marks of candiddate:"+(i+1));
			for(int j=0;j<4;j++)
			{a[i][j]=s.nextInt();
			total[c]+=a[i][j];
			}
				System.out.println("total:"+total[c]);
			
			percentage[c]=(float)((total[c]/400)*100);
			c++;
			}
		for(int p=0;p<4;p++)
		{
			System.out.println("percentage of candiddate:"+(p+1)+"="+percentage[p]);
		}
	}

}
