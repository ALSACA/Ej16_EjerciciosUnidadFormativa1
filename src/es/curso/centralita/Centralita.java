package es.curso.centralita;

public class Centralita {
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
	public static void main(String[] args) {
		
		LlamadaLocal l1= new LlamadaLocal(9110020001, 913234567, 1.05, 0.05);
		
		
	}	
		

}
