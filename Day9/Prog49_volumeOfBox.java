package Day9;

public class Prog49_volumeOfBox {

	public static void main(String[] args) {
		volume v=new volume();
		v.demo(10, 30, 70);
	}

}
class volume
{int volume;
	public void demo(int width,int height,int depth)
	{
		volume=width+height+depth;
		System.out.println("Volume of the box is "+volume);
	}
}