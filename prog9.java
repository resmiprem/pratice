package ey;

public class prog9 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		printarray(a,5);
		revarray(a,5);
		printarray(a,5);
	}
static void printarray(int a[],int size)
{
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
}
static void revarray(int a[],int size)
{
	int start =0,end=size-1,temp;
	while(start<end) {
	temp=a[start];
	a[start]=a[end];
	a[end]=temp;
	start++;
	end--;
	}
}
}
