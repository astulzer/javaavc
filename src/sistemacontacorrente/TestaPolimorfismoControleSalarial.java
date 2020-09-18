package sistemacontacorrente;

public class TestaPolimorfismoControleSalarial {

	public static void main(String[] args) {
		ControleSalarial controle = new ControleSalarial();
		
		
		Funcionario2 f2 = new Funcionario2();
		f2.setSalario(1000);
		controle.setTotalSalarial(f2);
		System.out.println(controle.getTotalSalarios());
		
		//Funcionario2 g3 = new Gerente3();//
		Gerente3 g3 = new Gerente3();// acima mostra melhor o polimorfismo
		g3.setSalario(10000);
		controle.setTotalSalarial(g3);
		System.out.println(controle.getTotalSalarios());
	}

}
