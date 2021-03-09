package Day15;
import java.io.File;
import java.io.FilenameFilter;
public class IODemo2 {

	public static void main(String[] args) {
	
File f=new File("c:/temp");
System.out.println("path....."+f.getAbsolutePath());
System.out.println("filename....."+f.getName());
System.out.println("does the file exists.....");
System.out.println(f.exists()?"yes file exists":"file doesnt exist");
System.out.println(f.canWrite());
System.out.println(f.isDirectory());
File destinyfile=new File("d:/temptemp");
f.renameTo(destinyfile);
String s[]=destinyfile.list(new MyFilter("html"));
for(String ss:s)
{
	System.out.println(ss);
}
	}

}
class MyFilter implements FilenameFilter
{String extension;
public MyFilter(String extension)
{
	this.extension=extension;
}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith("."+extension);
	}
	
}
