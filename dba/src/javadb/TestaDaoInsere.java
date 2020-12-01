package javadb;

import java.sql.SQLException;

public class TestaDaoInsere {
	public static void main(String[] args) {	
		try {
			Contato contato = new Contato();
			contato.setNome("Maria");
			contato.setEmail("maria@gmail.com");
			contato.setEndereco("Av. Brasil , nr 1000");
			
			ContatoDao dao;
			dao = new ContatoDao();
			dao.adiciona(contato);
			System.out.println("Gravação feita no BD");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
