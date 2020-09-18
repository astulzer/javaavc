package sistemacontacorrente;

public class Gerente extends Funcionario2{
	int senha;
	
	public boolean verifica(int senha) {
		if (this.senha ==senha) {
			System.out.println("Acesso autorizado");
			return true;
		}else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
	
	
	
}
