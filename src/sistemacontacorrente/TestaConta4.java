package sistemacontacorrente;

public class TestaConta4 {
	public static void main(String[] args) {
		Conta4 c1 = new Conta4("Railton", "1234");
		System.out.println("Nome do Cliente: "+c1.cliente.nome);
		System.out.println("CPF do Cliente: "+c1.cliente.cpf);
		int contador = Conta4.getContadorContas();
		System.out.println("Nosso banco possuir"+contador+" contas");
		
		Conta4 c2 = new Conta4("Lucas", "5678");
		System.out.println("Nome do Cliente: "+c2.cliente.nome);
		System.out.println("CPF do Cliente: "+c2.cliente.cpf);
		//contador = c1.getContadorContas();
		contador = Conta4.getContadorContas(); //pois agora e um metodo da classe
		System.out.println("Numero de contas"+contador);
		
	}
}
