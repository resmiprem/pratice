package ey;
import java.util.Scanner;
public class prog8 {

	public static void main(String[] args) {
		int n,x;
		System.out.println("enter no of elements in an array:");
		Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {a[i]=sc.nextInt();
       }
       System.out.println("Enter the num whose position is to be found");
       x=sc.nextInt();
       for(int i=0;i<n;i++)
       {
    	   if(a[i]==x)
    	   {
    		   System.out.println("The no is at the position:"+(i+1));
    		   break;
    	   }
       }
	}

}
