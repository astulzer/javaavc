package excecoes;

public class TesteException {

	public static void main(String[] args) {
		System.out.println("Inicio do metodo main");
		metodo1();
		System.out.println("fim do metodo main");
		
	}
	private static void metodo1() {
		System.out.println("inicio do metodo 1");
		metodo2();
		System.out.println("fim do metodo1");
		
	}
	private static void metodo2() {
		System.out.println("inicio do metodo 2");
		int array[];
		array = new int[10];
		
		for (int i = 0; i <20; i++) {
			array[i]= i;
			System.out.println(i);
		}
			
			System.out.println("fim do metodo2");
	}
}
