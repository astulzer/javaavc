package sistemacontacorrente;

public class ControleSistemaInterno {
	String senha;
	
	
	void validaSenha(FuncionarioEspecial funcionario) {
		funcionario.verifica(senha);
		//implementa��o para valida��o de senha
	}
}
