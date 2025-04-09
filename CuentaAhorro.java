package ej11;

public class CuentaAhorro extends Cuenta
{
	private double limite;

	public CuentaAhorro()
	{
		super();
	}

	public CuentaAhorro(double saldo, double limite)
	{
		super(saldo);
		this.limite = limite;
	}
	
	///////////////////////////////////////////////

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	////////////////////////////////////////////////

	@Override
	public double Agregar(double a)
	{
		double i;
		i=a+getSaldo();
		
		if(i>limite)
		{
			System.out.println("ERROR: El saldo es excedente al limite.");
		}
		
		return i;
	}

	@Override
	public double Quitar(double a)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void imprimirSaldo()
	{
		// TODO Auto-generated method stub
		
	}
	
}
