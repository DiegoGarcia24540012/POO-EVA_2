package ej7;

public class EmpleadoTemporal extends Empleado
{
	private int contrato;
	private int horas;
	
	public EmpleadoTemporal(String nombre, String apellido, double salario, int contrato, int horas)
	{
		super(nombre, apellido, salario);
		this.contrato = contrato;
		this.horas = horas;
	}

	public EmpleadoTemporal() 
	{
		super();
		this.contrato = 00000;
		this.horas = 0;
	}

	/////////////////////////////////////////////////////////
	
	public int getContrato() {
		return contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	////////////////////////////////////////////////////////
	
	public double calcularSalario()
	{
		return super.calcularSalario()*horas;
	}
	
	public String toString()
	{
		String cade = super.toString();
		cade = cade+"\nNumero de contrato: "+getContrato()+"\nHoras: "+getHoras()+"\nSalario total: "+calcularSalario();
		return cade;
	}
}
