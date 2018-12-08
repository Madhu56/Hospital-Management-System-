import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class Connect {
	Connection con = null;

	public static Connection ConnectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms");
			return con;

		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

	}
}
