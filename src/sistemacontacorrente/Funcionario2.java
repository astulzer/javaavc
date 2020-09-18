package sistemacontacorrente;

abstract class Funcionario2 {
	private String nome;
	private String cpf;
	private String departamento;
	private String dataAdmissao;
	private double salario;
	private String status;
	 
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getDataAdmissao() {
		return dataAdmissao;
	}


	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	//bonificacao percentual do salario
//	double getBonus() {
//		return this.salario*0.05;
//	}
	//toda classe com metodo abstrato tem que ser abstrata
	//mas, nem toda classe abstrata, tem metodos abstratos
	abstract double getBonus();
	
	//a consequencia de uma classe ser abstrata eh que
	//ela não pode ser instanciada -> vide TestaGerente2
	//mas pode ser referenciada -> Vide ControleBonus
	//a consequencia de um metodo ser abstrato eh que
	//todos que herdarem da classe abstrata são obrigados
	//a implementar o metodo abstrato

	
    //classe C1 abstrata com metodo m1 abstrato
	//classe C2 abstrata que herda C1->não precisa implementar m1
	//classe C3 concreta que herda C2->obrigada a implementar m1
}