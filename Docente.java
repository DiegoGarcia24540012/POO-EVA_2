package ej12;

final class Docente extends Empleado
{
	private String materia;
	

	public Docente(String nombre, String apellido, String clave, String materia)
	{
		super(nombre, apellido, clave);
		this.materia = materia;
	}

	public Docente()
	{
		super();
	}
	
	//////////////////////////////////////////////

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	
	
}
