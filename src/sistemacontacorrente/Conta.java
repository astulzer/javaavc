package sistemacontacorrente;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean sacar(double valor) {
		//double saldoAlterado = saldo - valor;
		//saldo = saldoAlterado;
		//OUTRO OPCAO1
		//saldo = saldo - valor;
		//OUTRO OPCAO2
		//saldo -= valor;
		//OUTRO OPCAO3
		//this.saldo -= valor;
		if (valor <= this.saldo+this.limite) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public char[] getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLimite(int i) {
		// TODO Auto-generated method stub
		
	}

	public char[] getLimite() {
		// TODO Auto-generated method stub
		return null;
	}
}