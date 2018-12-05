import java.sql.*;

class DB2 {
	public static void main(String[] args) {
		try {

			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb", "mssusr40",
					"miracle40");
			Statement s = con.createStatement(); // creating statement

			ResultSet rs = s.executeQuery("select * from emp01"); // executing statement

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

			con.close(); // closing connection

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}