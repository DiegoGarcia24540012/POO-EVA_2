package ej7;

public class EmpleadoBase extends Empleado
{
	private String clave;
	private int bono;
	
	public EmpleadoBase(String nombre, String apellido, double salario, String clave, int bono)
	{
		super(nombre, apellido, salario);
		this.clave = clave;
		this.bono = bono;
	}

	public EmpleadoBase()
	{
		super();
		this.clave = "#####";
		this.bono = 0;
	}
	
	////////////////////////////////////////////

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(int bono) {
		this.bono = bono;
	}
	
	/////////////////////////////////////////////
	
	public double calcularSalario()
	{
		double i;
		i = super.calcularSalario()+(super.calcularSalario()*(bono*0.01));
		return i;
	}
	
	public String toString()
	{
		String cade = super.toString();
		cade = cade+"\nNumero de empleado: "+getClave()+"\nBono: "+getBono()+"\nSalario total: "+calcularSalario();
		return cade;
	}
	
	
}
