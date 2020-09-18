package sistemacontacorrente;

public class ControleSistemaInterno {
	String senha;
	
	
	void validaSenha(FuncionarioEspecial funcionario) {
		funcionario.verifica(senha);
		//implementação para validação de senha
	}
}
