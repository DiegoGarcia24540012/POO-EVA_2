package ej8;

public class EVA2_8_OVERRIDE
{

	public static void main(String[] args)
	{
		Libro lib = new Libro();
		Grabacion grab = new Grabacion();
		
		lib.setAutor("Marquez, G");
		lib.setEdit("Editorial Sudamericana");
		lib.setTitulo("Cien años de soledad");
		lib.setYear(1967);
		
		grab.setAlbum("Thriller");
		grab.setAutor("Jackson, M");
		grab.setLabel("Epic Records");
		grab.setTitulo("Billie Jean");
		grab.setYear(1982);
		
		System.out.println(lib);
		System.out.println(grab);
	}

}
