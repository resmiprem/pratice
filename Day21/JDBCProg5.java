package Day20;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Types;

import java.sql.CallableStatement;
public class JDBCProg5 {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");//register the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ey","root","root");
		CallableStatement cs=con.prepareCall("{call proc3(?,?)}");
		int uid=4;
		cs.setInt(1, uid);
		cs.registerOutParameter(2, Types.VARCHAR);
		cs.execute();
		System.out.println("the username of "+uid+" is "+cs.getString(2));
	}

}
