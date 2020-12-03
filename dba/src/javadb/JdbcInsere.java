package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsere {
	public static void main(String[] args) {
		try{
			Connection con = ConnectionFactory.getConnection();
			String sql = "insert into contatos (nome,email, endereco) values (?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "Joao");
			stmt.setString(2, "joao@gmail.com");
			stmt.setString(3, "Av Brasil, nr 1000");
			
			stmt.execute();
			stmt.close();
			System.out.println("Gravação feita com Sucesso!");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
