package sistemacontacorrente;

public class TestaPolmorfismoControleBonus {
	public static void main(String[] args) {
		ControleBonus controle = new ControleBonus();
		
		Funcionario2 f2 = new Funcionario2();
		f2.setSalario(1000);
		controle.setTotalBonus(f2);
		System.out.println(controle.getTotalBonu());
		
		Funcionario2 g3 = new Gerente3();
		g3.setSalario(10000);
		controle.setTotalBonus(g3);
		System.out.println(controle.getTotalBonu());
		
	}
}
