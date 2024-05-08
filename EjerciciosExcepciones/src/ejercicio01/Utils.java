package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	static public double readDouble(Scanner sc) {
		double num = 0.0;
		try {
			num = sc.nextDouble();
		}catch(InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo double");
		}finally {
			sc.nextLine();
		}
		return num;
	}
	
	static public int readInt(Scanner sc) {
		int num = 0;
		try {
			num = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("El valor introducido no es de tipo int");
		}finally {
			sc.nextLine();
		}
		return num;
	}
}
