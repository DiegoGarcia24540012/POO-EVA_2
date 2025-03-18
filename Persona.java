package ej9;

public abstract class Persona // Las clases abstractas no se pueden instanciar
{
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Persona()
	{
		this.nombre = "#####";
		this.apellido = "#####";
		this.edad = 0;
	}
	
    /////////////////////////////////////////////////////////////

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/////////////////////////////////////////////////////////////
	
	/* METODO ABSTRACTO: Es un requisito obligatorio para las clases que hereden de Persona.*/
	
	public abstract void imprimirDatos();
	
}
