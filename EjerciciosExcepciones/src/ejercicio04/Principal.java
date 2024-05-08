package ejercicio04;

import ejercicio03.NegativeCountException;
import ejercicio03.WrongFormatException;

public class Principal {

	public static void main(String[] args) {
		Articulo a = null;
		
		try {
			a = new Articulo("Detergente",10, 0);
		}catch(WrongFormatException e){
			System.out.println(e);
		}catch(NegativeCountException e){
			System.out.println(e);
		}catch(NegativeStockException e) {
			System.out.println(e);
		}
	}

}
