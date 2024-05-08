package ejercicio04;

public class NegativeStockException extends Exception{
	public String toString() {
		return"El stock no puede ser negativo o 0";
	}
}
