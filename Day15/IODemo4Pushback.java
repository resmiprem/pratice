package Day15;
import java.io.PushbackInputStream;
import java.io.ByteArrayInputStream;
public class IODemo4Pushback {

	public static void main(String[] args)throws Exception {
	String s="hello hello hello";
	PushbackInputStream pbs =new PushbackInputStream(new ByteArrayInputStream(s.getBytes()));
	int c;
	while((c=pbs.read())!=-1)
	{
		if((char)c=='h')
		{
		pbs.unread('H');	
		}
		else
		{
			System.out.println((char)c);
		}
	}
	}
}
