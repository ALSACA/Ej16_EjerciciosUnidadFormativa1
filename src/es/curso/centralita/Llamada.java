package es.curso.centralita;

public abstract class Llamada {
	/*1. EJERCIO- CENTRALITA DE LLAMADAS - Desarrollar una Centralita
	 telefónica en la cual se van registrando llamadas.
	*Registrar una llamada consiste en contabilizar el número de llamadas
	realizadas así como el coste total de todas las llamadas realizadas.
	Las llamadas se irán mostrando por pantalla según se vayan registrando.
	Existen dos tipos de llamadas: las locales que cuestan 5 céntimos 
	el segundo y las provinciales, que dependiendo de la franja horaria 
	cuestan por segundo:8 céntimos en la franja 1, 12 céntimos en la 
	franja 2 y 16 céntimos en la franja 3. Los datos de cada llamada 
	son: el número de origen de la llamada, el número de destino y su 
	duración en segundos.
	*Crear una centralita, que registre llamadas de distintos tipos. 
	Para esto cree una clase con método main en dicho método crear un 
	objeto tipo Centralita y varias llamadas Locales y Provinciales.
	Agregar las a la centralita. Para poder agregar las llamadas a la 
	centralita, la clase Centralita debe tener un método para agregar una 
	llamada.  Por lo tanto la Centralita debe tener internamente una 
	estructura de datos que permita agregar varias llamadas  ya sean 
	locales o provinciales.
	*/
	private int origen;
	private int destino;
	private int duracion;
	private double precioLlamada;
	
	public Llamada() {
		super();
	}

	public Llamada(int origen, int destino, int duracion, double precioLlamada) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
		this.precioLlamada = precioLlamada;
	}

	public int getOrigen() {
		return origen;
	}

	public void setOrigen(int origen) {
		this.origen = origen;
	}

	public int getDestino() {
		return destino;
	}

	public void setDestino(int destino) {
		this.destino = destino;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPrecioLlamada() {
		return precioLlamada;
	}

	public void setPrecioLlamada(double precioLlamada) {
		this.precioLlamada = precioLlamada;
	}
	
	public abstract void calcularPrecioLlamada();

	@Override
	public String toString() {
		return "Llamada [origen: " + origen + ", destino: " + destino
				+ ", duracion: " + duracion + ", precioLlamada: " + precioLlamada
				+ "]";
	}
	
	
	
	
	
			
	
	
    
}	