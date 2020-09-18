package sistemacontacorrente;

public class Funcionario {
	String nome;
	String cpf;
	String departamento;
	String dataAdmissao;
	double salario;
	String status;
	
	//bonificacao fixa ad-hoc
	void bonificar(double bonus) {
		this.salario += bonus;
	}
}