package ejercicio03;

public class CuentaCorriente {

	private String dni;

	private String nombre;

	private double saldo;

	public CuentaCorriente(String dni, double saldo) throws WrongFormatException, NegativeCountException {

		if(dni != null && !dni .equals("") ) 
			this.dni = dni;
		else
			throw new WrongFormatException();
		
		if(saldo  > 0)
			this.saldo = saldo;
		else
			throw new NegativeCountException();
	}

	public CuentaCorriente(String dni, String nombre, double saldo) throws WrongFormatException, NegativeCountException {

		if(dni != null && !dni .equals("") ) 
			this.dni = dni;
		else
			throw new WrongFormatException();
		
		if(nombre != null && !nombre.equals("") ) 
			this.nombre = nombre;
		else
			throw new WrongFormatException();
		
		if(saldo  > 0)
			this.saldo = saldo;
		else
			throw new NegativeCountException();
		}

	public boolean sacarDinero(double sacar) {
		
		boolean posible = false;
		
		if(saldo - sacar > 0) {
			posible = true;
			
			saldo -= sacar;
		}
		
		
		return posible;
	}

	public void ingresarDinero(double ingreso) {
		
		saldo += ingreso;
		
	}
	
	public void mostrarInformacion(boolean muestraInfo) {
		
		if(muestraInfo) {
			
			System.out.println("Nombre titular: " + nombre);
			System.out.println("DNI: " + dni);
			System.out.println("Saldo: " + saldo);
		}
		
	}
}
