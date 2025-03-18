package ej9;

public class Cliente extends Persona
{
	private String tipo;
	
	public Cliente(String nombre, String apellido, int edad, String tipo)
	{
		super(nombre, apellido, edad);
		this.tipo = tipo;
	}
	
	public Cliente()
	{
		super();
		this.tipo = "#####";
	}
	
	///////////////////////////////////////////

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	
    ////////////////////////////////////////

	@Override
	public void imprimirDatos()
	{
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getApellido());
		System.out.println("Edad: "+getEdad());
		System.out.println("Tipo de persona: "+getTipo());
	}
	
	////////////////////////////////////////
	
}
