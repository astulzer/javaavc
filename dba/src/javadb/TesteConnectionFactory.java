package javadb;

import java.sql.Connection;

public class TesteConnectionFactory {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			System.out.println("Conectado ao Banco de dados MYSQL Local.");
			con.close();
		}	catch(SQL)

	}

}
