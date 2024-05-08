package ejercicio03;

public class Principal {

	public static void main(String[] args) throws NegativeCountException {
		CuentaCorriente cc = null;
		try {
			cc = new CuentaCorriente("12345678Z", 20.5);
		} catch (WrongFormatException e) {
			System.out.println(e);
		}catch(NegativeCountException e){
			System.out.println(e);
		}
		
		try {
			cc = new CuentaCorriente("12345678Z", "", 20.5);
		} catch (WrongFormatException e) {
			System.out.println(e);
		}catch(NegativeCountException e){
			System.out.println(e);
		}
		
	}

}
