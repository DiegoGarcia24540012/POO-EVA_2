package ej11;

public abstract class Cuenta
{
	private double saldo;
	
	////////////////////////////////////
	
	public Cuenta(double saldo)
	{
		this.saldo = saldo;
	}
	public Cuenta()
	{
		this.saldo = 0;
	}
	
	/////////////////////////////////////
	
	public double getSaldo()
	{
		return saldo;
	}
	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}
	
	//////////////////////////////////////
	
	public abstract double Agregar(double a);
	public abstract double Quitar(double a);
	public abstract void imprimirSaldo();
}
