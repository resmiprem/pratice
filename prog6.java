package ey;
import java.util.Scanner;
public class prog6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Size of the array: "+arr.length);
		int size = sc.nextInt();
		arr = new int[size];
		System.out.println("size of the array after resizing: "+arr.length);
	}

}
