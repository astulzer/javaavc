package excecoes;

public class TesteExceptionAprimorado {

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
		
		try{for (int i = 0; i <20; i++) {
			array[i]= i;
			System.out.println(i);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("erro pego (catched)"+e);
		}
			System.out.println("fim do metodo2");
	}
}
