package Day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCProg4 {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");//register the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ey","root","root");
		
	String	sql="select * from users where userid=? and username=?";
	PreparedStatement st= con.prepareStatement(sql);
	while(true)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter userid.....");
		int uid=scan.nextInt();
		System.out.println("enter username");
		String username=scan.next(); 
	st.setInt(1, uid);
	st.setString(2, username);
	
		ResultSet rs=st.executeQuery(); 
		ResultSetMetaData rsmd=rs.getMetaData();
		int noOfColumns=rsmd.getColumnCount();
		for(int i=1;i<noOfColumns;i++)
		{
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println();
	
		while(rs.next())
		{for(int i=1;i<noOfColumns;i++)
		{
			//System.out.print(rs.getInt(1));
			//System.out.print(rs.getString("username")+"\t");
			//System.out.print(rs.getString("upass")+"\t");
			//System.out.print(rs.getInt("flag")+"\t");
			System.out.print(rs.getString(i)+"\t");
		}
		System.out.println();
		}
	
	}
	}

}
