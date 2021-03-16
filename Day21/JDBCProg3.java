package Day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBCProg3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//register the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ey","root","root");
		Statement st= con.createStatement();
	String	sql="select * from users";
		ResultSet rs=st.executeQuery(sql); 
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
