package aulacollection;

import java.util.HashSet;
import java.util.Set;

public class TestaSet1 {
	public static void main(String[] args) {
		Set objetos = new HashSet();
		objetos.add("Objeto1");
		objetos.add("Objeto2");
		objetos.add("Objeto3");
		objetos.add("Objeto2");
		objetos.add("Objeto1");
		System.out.println(objetos+"\n");
		System.out.println(objetos.size());
	
		for (Object object : objetos) {
			System.out.println(object);
		}
		
	}
	
}
