package Day20;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class JDBCProg1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
Class.forName("com.mysql.cj.jdbc.Driver");//register the driver
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ey","root","root");//establish a connection
System.out.println(con);
DatabaseMetaData dbmd=(DatabaseMetaData) con.getMetaData();
System.out.println(dbmd.getDatabaseProductName());
System.out.println(dbmd.getDriverMajorVersion());
System.out.println(dbmd.getURL());
System.out.println(dbmd.supportsTransactions());
}

}
