package ej14;

public class Circulo implements Figura, MostrarDatos
{
	private double radio;
	
	public Circulo(double radio)
	{
		this.radio = radio;
	}

	public Circulo()
	{
		this.radio = 0;
	}

	///////////////////////////////////////
	
	public double getRadio()
	{
		return radio;
	}

	public void setRadio(double radio)
	{
		this.radio = radio;
	}
	
	/////////////////////////////////////

	@Override
	public double calcularArea()
	{
		return Math.PI*(radio*radio);
	}
	
	@Override
	public double calcularPerimetro()
	{
		return Math.PI*(radio*2);
	}

	@Override
	public void mostrarDatos()
	{
		System.out.println("\n=== CIRCULO ===");
		System.out.println("Area: "+calcularArea());
		System.out.println("Perimetro: "+calcularPerimetro());
	}
	
}
