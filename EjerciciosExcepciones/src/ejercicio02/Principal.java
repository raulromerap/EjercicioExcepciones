package ejercicio02;

public class Principal {

	public static void main(String[] args) throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		Hora h = new Hora(3,9);
		HoraExacta he = null;
		try {
			he = new HoraExacta(23, 59, 59);
		}catch(NegativeHourException e) {
			System.out.println(e);
		}catch(NegativeMinuteException e){
			System.out.println(e);
		}catch(NegativeSecondException e) {
			System.out.println(e);
		}
		System.out.println(h);
		System.out.println(he);
		
		h.inc();
		
		he.inc();
		System.out.println("_______________");
		System.out.println(h);
		System.out.println(he);
	}
}
