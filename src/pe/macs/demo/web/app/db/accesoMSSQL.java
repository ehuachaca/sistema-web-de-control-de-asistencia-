package pe.macs.demo.web.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class accesoMSSQL {
	public accesoMSSQL() {}
	public static Connection getConnection() throws SQLException {
		Connection cn=null;
		try {
			String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://DESKTOP-TK6Q2UL:1433;database=DB_APP_ASIST;loginTimeout=30;";
			String user="sa";
			String pwd="MAxCS1120489.?#";
			Class.forName(driver).newInstance();
			cn=DriverManager.getConnection(url, user, pwd);
			System.out.println("Conexion exitosa");
		} catch (Exception e) {
			throw new SQLException("Error en la conexion de base de datos");
		}
		return cn;
	}
	public static void main(String []args) throws SQLException {
		getConnection();
	}
}
