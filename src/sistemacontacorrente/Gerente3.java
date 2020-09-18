package sistemacontacorrente;

public class Gerente3 extends FuncionarioEspecial{
	int senha;
	
	double getBonus() {//5% do bonus + 5000
	//	return super.getBonus() + 5000;
		return super.getSalario()*0.05+ 5000;
	}//aplicamos polimorfismo -> pode ter comportamentos diferentes
	
//	public boolean verifica(int senha) {
//		if (this.senha ==senha) {
//			System.out.println("Acesso autorizado");
//			return true;
//		}else {
//			System.out.println("Acesso não autorizado");
//			return false;
//		}
//	}
    	boolean verifica(String senha) {
    		return false;
    	}
}
