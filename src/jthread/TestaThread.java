package jthread;

public class TestaThread {

	public static void main(String[] args) {
		DesenhaMapa dMapa = new DesenhaMapa();
		Thread tMapa = new Thread(dMapa);
		tMapa.start(); // dispara a thread na minha jvm

		BarraDeProgresso bProg = new BarraDeProgresso();
		Thread tBProg = new Thread(bProg);
		tBProg.start(); 
		
	}

}
