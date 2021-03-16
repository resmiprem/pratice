package Day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class JDBCProg2 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");//register the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ey","root","Imser1301*");//establish a connection
Statement st= con.createStatement();

String sql="insert into users values(3,'resmi','supergal',0)" ;

int noOfRowsInserted= st.executeUpdate(sql);
System.out.println("no of rows inserted....:"+noOfRowsInserted);
sql="select * from users";
Boolean b=st.execute(sql);
System.out.println("the query returned a ResultSet......:"+b);
	}

}
