package Day15;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class CopyCommandFiles {

	public static void main(String[] args) {
		
		CopyCommand c =new CopyCommand();
		c.copy("C:\\Users\\CS577TT\\eclipse-workspace\\Day5\\src\\abc.properties");
	}

}
class CopyCommand
{
	public void copy(String filename)
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		FileReader read=null;
		try
		{
			FileWriter writer=new FileWriter("C:\\Users\\CS577TT\\eclipse-workspace\\Day5\\src\\copyabc.properties");
		
		read=new FileReader(filename);
	
	int noOfCharRead;
	char c[]=new char[5];
	while((noOfCharRead=read.read(c))!=-1)
	{System.out.println(noOfCharRead);
		String s=new String(c,0,noOfCharRead);
		System.out.println(s);
		System.out.println("loop runs");
		writer.write(c,0,noOfCharRead);
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try {
			read.close();
			//writer.close();
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}
}