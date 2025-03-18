package ej9;

public class Empleado extends Persona
{
	private double sueldo;

	public Empleado(String nombre, String apellido, int edad, double sueldo)
	{
		super(nombre, apellido, edad);
		this.sueldo = sueldo;
	}
	
	public Empleado()
	{
		super();
		this.sueldo = 0;
	}
	
	///////////////////////////////////////////

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	//////////////////////////////////////////

	@Override
	public void imprimirDatos()
	{
		System.out.println("=== EMPLEADO ===\n");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getApellido());
		System.out.println("Edad: "+getEdad());
		System.out.println("Sueldo: "+getSueldo());
	}
	
}
