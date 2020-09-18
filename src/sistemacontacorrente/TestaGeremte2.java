package sistemacontacorrente;

public class TestaGeremte2 {
	public static void main(String[] args) {
//		Funcionario2 f2 = new Funcionario2();//classe abstrata n pode ser instanciada
//		f2.setSalario(1000);
//		double salFunc = f2.getSalario();
//		System.out.println("Salario funcionario: R$" +salFunc);
//		double bonusFunc = f2.getBonus();
//		System.out.println("Bonus Funcionario: R$" +bonusFunc);
		
		Gerente2 g2 = new Gerente2();
		g2.setSalario(10000);
		double salger = g2.getSalario();
		System.out.println("Salario funcionario: R$" +salger);
		double bonusger = g2.getBonus();
		System.out.println("Bonus Funcionario: R$" +bonusger);
		
		
	}
}
