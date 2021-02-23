package Day6;
import java.util.Scanner;
public class BullDogDemo {
	
	public static void main(String[] args)throws Exception{
		Scanner s=new Scanner(System.in);
		String str1="Day6.";
		System.out.println("Enter stick or stone");
		String str2=s.next();
		String str3="";
		str3=str1+str2;
		Child baby=new Child();
		BullDog dog=contain.getDogRes(str3);
		baby.playWithDog(dog);
	}

}
class contain
{public static BullDog getDogRes(String str)throws Exception {
	Child baby=new Child();
	BullDog dog=new BullDog();
	DogResponse res=(DogResponse)Class.forName(str).newInstance();
	dog.res=res;
	return dog;
	}
}
class BullDog
{DogResponse res;
	public void Play()
	{
		res.DogStatement();
	}
}
class Child
{
	public void playWithDog(BullDog dog) {
		dog.Play();}
}
abstract class DogResponse
{
	abstract public void DogStatement();
}
class Stick extends DogResponse
{

	public void DogStatement() {
		System.out.println("you beat I bite......");
		}
	}

	class Stone extends DogResponse{
	public void DogStatement() {
		System.out.println("you hit I bark......");
		}
	}