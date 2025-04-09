package ej22;

public class EVA2_22_INSTANCE_OF
{

	public static void main(String[] args)
	{
		Gato garu = new Gato();
		Serpiente serp = new Serpiente();
	}
	
	///////////////////////////////////////////
	
	public static void imprimir(Animal animal)
	{
		animal.respirarOxigeno();
		if(animal instanceof Gato)
		{
			System.out.println("Objeto de tipo Gato");
		}
		else
		{
			System.out.println("Objeto de tipo Serpiente");
		}
	}
	
}
