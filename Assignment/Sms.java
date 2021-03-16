package Day16;


import java.util.Map;
import java.util.Set;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Sms extends readxml{
    // Find your Account Sid and Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) throws Exception{
    	int i=0;readxml rx=new readxml();
    	Map<String, Object[]> data=rx.read();
    	Set<String> keyset = data.keySet();
    	StringBuffer msg = new StringBuffer("The grocerybill\n");
    	 String[] ob=new String[40];
         for (String key : keyset) {
       	  Object[] objArr = data.get(key);
     	    for (Object obj : objArr) {
     	   ob[i]=(String)obj;
     	   //System.out.println(ob[i]);
     	 msg.append(ob[i]+"     ");
       i++;
     	    
     	    	
         //Transport.send(message);
     	    }msg.append("\n");}
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+919344537734"),
                new com.twilio.type.PhoneNumber("+15017122661"),
                msg.toString()).create();
        System.out.println("success");
}
}