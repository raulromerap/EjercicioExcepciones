package ejercicio04;

import ejercicio03.NegativeCountException;
import ejercicio03.WrongFormatException;

public class Articulo {

	/**
	 * Atributo que guarda el valor del IVA
	 */
	public final double IVA = 0.21;
	/**
	 * Atributo que guarda el nombre del articulo
	 */
	private String nombre = "";
	/**
	 * Atributo que guarda el precio del articulo
	 */
	private double precio;
	/**
	 * Atributo que guarda el valor de cuantos articulos quedan
	 */
	private int cuantosQuedan;

	/**
	 * Constructor que iguala los valores introducidos en Main a los atributos de la
	 * clase Articulo
	 * 
	 * @param nombre        El nombre del articulo
	 * @param precio        El precio del articulo
	 * @param cuantosQuedan La cantidad de articulos que quedan
	 * @throws WrongFormatException 
	 * @throws NegativeCountException 
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) throws WrongFormatException, NegativeCountException, NegativeStockException{
		if(nombre != null && !nombre.equals("") ) 
			this.nombre = nombre;
		else
			throw new WrongFormatException();
		
		if(precio  > 0)
			this.precio = precio;
		else
			throw new NegativeCountException();
		
		if(cuantosQuedan > 0)
			this.cuantosQuedan = cuantosQuedan;
		else
			throw new NegativeStockException();
		
		
	}

	/**
	 * Funcion que devuelve el nombre del articulo
	 * 
	 * @return Devuelve el nombre del articulo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Funcion que se encarga de cambiar el nombre del articulo
	 * 
	 * @param nombre El nombre del articulo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Funcion que devuelve el precio del articulo
	 * 
	 * @return Devuelve el precio del articulo
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Funcion que se encarga de cambiar el precio del articulo
	 * 
	 * @param precio El precio del articulo
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Funcion que devuelve la cantidad de articulos que quedan
	 * 
	 * @return Devuelve la cantidad de articulos que quedan
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Funcion que se encarga de cambiar la cantidad de articulos que quedan
	 * 
	 * @param cuantosQuedan la cantidad de articulos que quedan
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Funcion que devuelve el valor del IVA
	 * 
	 * @return Devuelve el valor del IVA
	 */
	public double getIVA() {
		return IVA;
	}

	/**
	 * Funcion que devuelve el precio venta al publico
	 * 
	 * @return Devuelve el PVP, precio real
	 */
	public double getPVP() {
		return this.precio + (this.precio * this.IVA);
	}

	/**
	 * Funcion que devuelve el precio con descuento
	 * 
	 * @param descuento El descuento que tiene el articulo
	 * @return Devuelve el precio con descuento
	 */
	public double getPVPDescuento(double descuento) {
		return getPVP() + (getPVP() * descuento);
	}

	/**
	 * Funcion que identifica si se puede hacer la venta
	 * 
	 * @param cantidad Cantidad que el usuario quiere comprar
	 * @return Devuelve un booleano que dice si se puede hacer o no la venta
	 */
	public boolean vender(int cantidad) {
		boolean venta = false;

		if (cuantosQuedan >= cantidad) {
			cuantosQuedan -= cantidad;
		}

		return venta;
	}

	/**
	 * Funcion que almacena mas cantidades de productos para su venta
	 * 
	 * @param cantidad Cantidad que quiere reponer el usuario
	 */
	public void almacenar(int cantidad) {
		cuantosQuedan += cantidad;
	}

	/**
	 * Funcion que imprime la informacion de los articulos
	 */
	public String toString() {

		String cadena = "";

		cadena += this.nombre + " " + getPVP() + " " + this.cuantosQuedan;

		return cadena;
	}

}
