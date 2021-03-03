package Day8;

public class Prog8_SingleTonClass {
	private static Prog8_SingleTonClass instance = null;  
	public String str;  
	  
	private Prog8_SingleTonClass() {}
	  
	public static Prog8_SingleTonClass getInstance() {  
	if (instance == null){  
	instance = new Prog8_SingleTonClass();  
	}  
	return instance;  
	  
	}  
	  
	
	public static void main(String[] args) {  
	// TODO Auto-generated method stub  
		Prog8_SingleTonClass single1 = Prog8_SingleTonClass.getInstance();  
	single1.str = "Hi I am the 1st ref class string";  
	Prog8_SingleTonClass single2 = Prog8_SingleTonClass.getInstance();  
	single2.str = "Hi I am the 2nd ref string";  
	Prog8_SingleTonClass single3 = Prog8_SingleTonClass.getInstance();  
	single3.str = "I am 3rd ref string";  
	System.out.println("first reference: "+single1.str);  
	System.out.println("second reference: "+single2.str);  
	System.out.println("third reference: "+single3.str);  
	}  
}
