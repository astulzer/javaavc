package sistemacontacorrente;

public class ControleSalarial {
	private double totalSalarios = 0;
	
	public void setTotalSalarial(Funcionario2 funcionario) {
		this.totalSalarios +=funcionario.getSalario();
		
	}
	
	public double getTotalSalarios() {
		return this.totalSalarios;
	}
}
