package ej4;

public class EVA2_4_HERENCIA_APA
{

	public static void main(String[] args)
	{
		Libro lib = new Libro();
		Grabacion grab = new Grabacion();
		
		lib.setAutor("Marquez, G");
		lib.setEdit("Editorial Sudamericana");
		lib.setTitulo("Cien años de soledad");
		lib.setYear(1967);
		lib.imprimirLibro();
		
		grab.setAlbum("Thriller");
		grab.setAutor("Jackson, M");
		grab.setLabel("Epic Records");
		grab.setTitulo("Billie Jean");
		grab.setYear(1982);
		grab.imprimirGrab();
	}

}