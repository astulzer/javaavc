package javadb;

import java.sql.SQLException;
import java.util.List;

public class TestaListaDao {

	public static void main(String[] args) {
		try {
			ContatoDao cdao;
			cdao = new ContatoDao();
			List<Contato> contatos = cdao.getLista();
			
			for (Contato contato : contatos) {
				System.out.println("Nome: "+contato.getNome());
				System.out.println("Email: "+contato.getEmail());
				System.out.println("Endereco: "+contato.getEndereco());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
