package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbc1Contactos {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		
		// Pasos para conectarme a una base de datos
		// 1- Levantar el driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2- Establecer conexion usando la interface  (url, usuario, password)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini_arg", "root", "admin");
		
		//3- Creamos la sentencia
		Statement sql = con.createStatement();
		
		//4- Ejecutar consulta
		//sql.execute(otroSql)
		ResultSet rs = sql.executeQuery("select nombre, email, telefono from contactos");
		
		//5- Mostrar los resultados
		while(rs.next()) {
			System.out.println("Nombre: " + rs.getString("nombre"));
			System.out.println("Email: " + rs.getString("email"));
			System.out.println("Telefono: " + rs.getString("telefono"));
			System.out.println("--------------------------------------------");
		}
		//Cerrar la conexion
		sql.close();
		con.close();
		
	}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
	}
}

}
