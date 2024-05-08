package ejercicio02;

public class Hora  {

	/**
	 * Atributo que guarda el valor de la hora
	 */
	protected int hora;
	
	/**
	 * Atributo que guarda el valor de los minutos
	 */
	protected int minutos;
	
	/**
	 * Constructor que guarda los valores recibidos en los atributos
	 * @param hora La hora que ha insertado el usuario
	 * @param minutos Los minutos que ha insertado el usuario
	 */
	public Hora(int hora, int minutos)  throws NegativeHourException, NegativeMinuteException{
		// Si se cumplen los valores basicos de las horas y los minutos se guardan en los atributos
		if(hora >= 0 && hora < 24)
			this.hora = hora;
		else 
			throw new NegativeHourException();
		
		if(minutos >= 0 && minutos < 60)	
			this.minutos = minutos;
		else
			throw new NegativeMinuteException();
		
	}
	
	/**
	 * Metodo que se encarga de incrementar la hora un minuto y cambiarlo correctamente
	 */
	void inc() {
		this.minutos++;
		if(this.minutos >59) {
			this.minutos = 0;
			this.hora ++;
			if(this.hora>23) {
				hora=0;
			}
		}
	}

	/**
	 * Asigna un valor a las horas
	 * @param hora La hora  insertada por el usuario
	 */
	public void setHora(int hora) throws NegativeHourException{
		if(hora >= 0 && hora < 24)
			this.hora = hora;
		else 
			throw new NegativeHourException();
	}

	/**
	 * Asigna un valor a los minutos
	 * @param minutos Los minutos insertados por el usuario
	 */
	public void setMinutos(int minutos) throws NegativeMinuteException {
		if(minutos >= 0 && minutos < 60)	
			this.minutos = minutos;
		else
			throw new NegativeMinuteException();
	}
	
	/**
	 * Metodo que imprime la hora de esta forma: 1:05
	 * 
	 * @return Devuelve la cadena con la hora formada
	 */
	@Override
	public String toString() {
		// Se crea una cadena para los minutos
		String minutos="";
		// Se crea una cadena para la hora formada
		String res = "";
		/*
		 * Si los minutos son de un digito se añade un cero delante sino se deja como está
		 */
		if(this.minutos< 10) {
			minutos += "0" + this.minutos;
		}else {
			minutos += this.minutos;
		}
		// Se forma la hora con las horas y los minutos
		res += this.hora+ ":" + minutos;
		
		// Se devuelve la cadena que contiene la hora
		return res;
	}
}
