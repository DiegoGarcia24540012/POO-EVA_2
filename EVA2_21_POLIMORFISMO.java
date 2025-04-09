package ej21;

public class EVA2_21_POLIMORFISMO {

	public static void main(String[] args)
	{
		Reptil reptil = new Serpiente();
		reptil.respirarOxigeno();
		reptil.tenerSangreFria();
		
		// COMO REGRESAR EL OBJETO A SU ESTADO ORIGINAL
		Serpiente objSerp = (Serpiente)reptil;
		objSerp.respirarOxigeno();
		objSerp.tenerSangreFria();
		objSerp.seArrastra();
		
		// Serpiente serpiente = new Animal(); <== POLIMORFISMO FALLIDO
		
		Object object = new Serpiente();
	}

}
