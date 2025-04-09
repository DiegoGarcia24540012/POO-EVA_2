package ej16;

public class Cliente extends Direccion
{
	private String nombre;
	private String apellido;
	private int edad;
	private Direccion direccion; // Cliente tiene una direccion
	
	
	public Cliente(String nombre, String apellido, int edad)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = new Direccion();
	}

	public Cliente()
	{
		this.nombre = "#####";
		this.apellido = "#####";
		this.edad = 0;
	}

	////////////////////////////////////////////
	
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	///////////////////////////////////////
	
	@Override
	public String toString()
	{
		return "Datos del cliente:\n"+ 
	           "Nombre: "+nombre+"\n"+
	           "Apellido: "+apellido+"\n"+
	           "Edad: "+edad+"\n"+
	           "Calle: "+direccion.getCalle()+"\n"+
	           "Numero: "+direccion.getNumero()+"\n"+
	           "Colonia: "+direccion.getColonia()+"\n"+
	           "Codigo postal: "+direccion.getCp()+"\n";
	}
	
}
