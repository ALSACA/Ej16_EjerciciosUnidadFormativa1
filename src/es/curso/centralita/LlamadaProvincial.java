package es.curso.centralita;

public class LlamadaProvincial extends Llamada {
	private int franja;
	private double precioFranja1;
	private double precioFranja2;
	private double precioFranja3;
	
	
	
	@Override
	public void calcularPrecioLlamada() {
		setPrecioLlamada(getPrecioLlamada()*getDuracion());
		
	}
	
	
	
	
}
