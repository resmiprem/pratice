package Day16;



//Java program to send email 

import java.util.*; 

import javax.mail.*; 
import javax.mail.internet.*; 
import javax.activation.*; 
import javax.mail.Session; 
import javax.mail.Transport; 


public class MailDemo  
{ 

public static void main(String [] args)  throws Exception
{     
   // email ID of Recipient. 
   
   final  String sender ="resmipremkumar1301@gmail.com"; 
   final String pswd ="chinnuresmi";
   // email ID of  Sender. 
   final String recipient = "resmipremkumar1301@gmail.com";
  

Properties prop=new Properties();
prop.put("mail.smtp.auth", "true");
prop.put("mail.smtp.starttls.enable", "true");
prop.put("mail.smtp.host", "smtp.gmail.com");
prop.put("mail.smtp.port", "587");
Session session=Session.getInstance(prop,new javax.mail.Authenticator()
{
	protected PasswordAuthentication getPasswordAuthentication() {
	return new PasswordAuthentication(sender,pswd);}
});
readxml rx=new readxml();
Map<String, Object[]> data=rx.read();
Set<String> keyset = data.keySet();
   try 
   { 
      // MimeMessage object. 
      MimeMessage message = new MimeMessage(session); 

      // Set From Field: adding senders email to from field. 
      message.setFrom(new InternetAddress(sender)); 

      // Set To Field: adding recipient's email to from field. 
      message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); 

      // Set Subject: subject of the email 
      message.setSubject("Grocery Bill!!!");
   // set body of the email. 
    //  message.setText("Grocery Bill!!!"); 
      int i=0;
   StringBuilder sb=new StringBuilder();
  // sb.append("sno    item       quantity    unit     price\n");
      String[] ob=new String[40];
      for (String key : keyset) {
    	  Object[] objArr = data.get(key);
  	    for (Object obj : objArr) {
  	   ob[i]=(String)obj;
  	   //System.out.println(ob[i]);
  	 sb.append(ob[i]+"     ");
    i++;
  	    	
      //Transport.send(message);
  	    }sb.append("\n");}
     
  
     // String str=ob.toString();
   //   System.out.println(ob.toString());
      message.setText(sb.toString());
      
      // Send email. 
    // Transport.send(message);
     // message.setContent(
         //     "<h1>Bill</h1>","text/html");
      //message.setContent( "<table=\"width:700%\"><tr><th>sno </th><th>item </th><th>quantity </th><th>unit </th><th>price </th> </tr></table>","text/html");
      Transport.send(message);
      System.out.println("Mail successfully sent"); 
   } 
   catch (MessagingException mex)  
   { 
      mex.printStackTrace(); 
   } 
} 
} 
