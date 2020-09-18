package sistemacontacorrente;

public class ControleBonus {
	private double totalBonus = 0;
	
	// classe abstrata pode ser REFERENCIADA
	public void setTotalBonus(Funcionario2 funcionario) {
		this.totalBonus += funcionario.getBonus();
		
	}
	public double getTotalBonu() {
		return this.totalBonus;
	}
	
}
