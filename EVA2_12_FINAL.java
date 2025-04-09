package ej12;

public class EVA2_12_FINAL
{
	final static int VALOR = 100;
	
	public static void main(String[] args)
	{
		// final: Palabra reservada para declarar una CONSTANTE que no puede cambiar su valor
		// Se escribe con mayusculas.
		// EJEMPLO: VALOR = 200; Error: No se puede asignar
		
		Docente doc = new Docente("Juan", "Perez", "2934", "Matematicas"); // Una clase final SI se puede instanciar
		
		// INTERFACES: Son como un contrato (igual que abstract). Solo permite metodos abstractos, no acepta atributos y todo es public
	}

}
