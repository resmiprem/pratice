package Day9;
import java.util.Scanner;
public class Prog24_square_nd_rec {

	public static void main(String[] args) {
		int len, bre, peri, area;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Length and Breadth of Rectangle : ");
        len = scan.nextInt();
        bre = scan.nextInt();
		
        area = len*bre;
        peri = (2*len) + (2*bre);
		
        System.out.print("Area = " +area);
		
        System.out.print("\nPerimeter = " +peri);
        Square s=new Square();
        s.squaremet();

	}

}
class Square
{
	public void squaremet()
	{
		int side, peri, area;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Side Length of Square : ");
        side = scan.nextInt();
		
        area = side*side;
        peri = 4*side;
		
        System.out.print("Area = " +area);
		
        System.out.print("\nPerimeter = " +peri);
	}
}