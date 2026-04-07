import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {
	public static void main(String args[]) {
		try {
			String username = "root";
			String password = "";
			String url = "jdbc:mysql://localhost:3306/lab_ten_jdbc";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection(url, username, password);
			String query ="INSERT INTO tbl_employee(full_name, email, contact , shift,emp_reg_no)"
					+"VALUES('Samir Singh','singhsamir@gmail.com','987234567','Morning','12401')";
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(query);
			if(result > 0) {
				System.out.println("data inserted successfully");
			}else {
				System.out.println("data insertion failed");
			}
		}
		catch(SQLException | ClassNotFoundException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}

}


