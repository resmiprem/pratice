package ey;
import java.util.Scanner;
public class Prog15b {

	public static void main(String[] args) {
	    int n;
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    if(amstrong(n))
	    {}
	    else if(perfect(n))
	    {}
	    else if(palindrome(n))
	    {}
	    else
	    {
	    	System.out.println("none of these");
	    }
	}
	static boolean amstrong(int n)
	{
		int c=0,r,temp;
temp=n;
		while(n>0)  
	    {  
	    r=n%10;  
	    n=n/10;  
	    c=c+(r*r*r);  
	    }
		if(temp==c)  
	        {System.out.println("armstrong number");
		return true;
	        }
		return false;
	}
	static boolean perfect(int n)
	{int sum=0;
		 for(int i = 1; i < n; i++)
	        {
	            if(n% i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	            if(n==sum)  
	            { System.out.println("perfect number");
	            return true;}
	            return false; }
	
	static boolean palindrome(int n)
	{int r,sum=0,temp;
	temp=n;
		  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   {System.out.println("palindrome number "); return true;}return false;
	}

}
