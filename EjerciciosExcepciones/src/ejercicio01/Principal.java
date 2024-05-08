package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double d = 0.0;
		int i = 0;
		
		System.out.println("Inserta un valor tipo double");
		d = Utils.readDouble(sc);
		System.out.println("Inserta un valor tipo int");
		i = Utils.readInt(sc);
		
		System.out.println("Numero tipo double: " + d);
		System.out.println("Numero tipo int: " + i);
	}

}
