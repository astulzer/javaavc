package javadb;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbcteste {
	public static void main(String[] args) {
		try {
			DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			System.out.println("Conectado ao banco de dados mysql local");
		} catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		
	
	}

}
