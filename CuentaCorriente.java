package ej11;

public class CuentaCorriente extends Cuenta
{
	@Override
	public double Agregar(double a)
	{
		return getSaldo()+a;
	}

	@Override
	public double Quitar(double a)
	{
		return getSaldo()-a;
	}

	@Override
	public void imprimirSaldo()
	{
		System.out.println("Saldo: "+getSaldo());
	}
	
}
