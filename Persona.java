package ej13;

public class Persona/* implements MostrarDatos*/ // En lugar de extends se usa implements
{
	private String nombre;
	private String apellido;
	
	
	public Persona()
	{
		
	}
	
	public Persona(String nombre, String apellido)
	{
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//////////////////////////////////////////////////
	
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

	/*@Override
	public void imprimirDatos()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
	}*/
	
}
