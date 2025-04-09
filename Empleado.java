package ej13;

public class Empleado extends Persona implements MostrarDatos
{
	// HERENCIA SIMPLE: Solo heredar de una clase.    HERENCIA MULTIPLE: Heredar de varias clases. Se puede simular con interfaces.
	private String clave;

	
	public Empleado(String nombre, String apellido, String clave)
	{
		super(nombre, apellido);
		this.clave = clave;
	}

	public Empleado()
	{
		super();
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public void imprimirDatos()
	{
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getApellido());
		System.out.println("Clave de empleado: "+clave);
	}

}
