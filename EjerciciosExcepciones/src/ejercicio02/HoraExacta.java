package ejercicio02;

public class HoraExacta  extends Hora{

	/**
	 * Atributo que guarda el valor de los segundos
	 */
	private int segundos;
	
	/**
	 * Constructor que guarda la hora exacta
	 * @param hora La hora insertada por el usuario
	 * @param minutos Los minutos insertados por el usuario
	 * @param segundos Los segundos insertados por el usuario
	 * @throws NegativeMinuteException, NegativeSecondException 
	 * @throws NegativeHourException 
	 */
	public HoraExacta(int hora, int minutos, int segundos) throws NegativeHourException, NegativeMinuteException, NegativeSecondException {
		super(hora, minutos);
		/*
		 * Solo se guarda el valor si cumple con la normativa de la hora
		 */
		if(segundos >= 0 && segundos < 60) 
			this.segundos = segundos;
		else
			throw new NegativeSecondException();
		
	}

	/**
	 * Asigna un valor a los segundos
	 * @param segundos Los segundos insertados por el usuario
	 * @throws NegativeSecondException 
	 */
	public void setSegundos(int segundos) throws NegativeSecondException {
		if(segundos >= 0 && segundos < 60) 
			this.segundos = segundos;
		else
			throw new NegativeSecondException();
	}
	
	public void inc() {
		this.segundos ++;
		if(this.segundos >59) {
			this.segundos=0;
			super.inc();
		}
	}
	
	public String toString() {
		String res="";
		String segundos ="";
		
		if(this.segundos < 10) {
			segundos += "0" + this.segundos;
		}else {
			segundos += this.segundos;
		}
		
		res += super.toString() + ":" + segundos;
		
		return res;
	}
	
}
