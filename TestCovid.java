package ej1;

public class TestCovid
{
	private int edad;
	private boolean enf;
	private double peso;
	private double alt;
	
	///////////////  CONSTRUCTORES  ///////////////////
	
	public TestCovid()
	{
		this.edad=43;
		this.enf=false;
		this.peso=65;
		this.alt=1.73;
	}
	
	public TestCovid(int edad, boolean enf, double peso, double alt)
	{
		this.edad=edad;
		this.enf=enf;
		this.peso=peso;
		this.alt=alt;
	}
	
	///////////////////  GET Y SET  /////////////////
	
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int valor)
	{
		edad=valor;
	}
	////////////////////////////////////
	public boolean getEnf()
	{
		return enf;
	}
	public void setEnf(boolean valor)
	{
		enf=valor;
	}
	////////////////////////////////////
	public double getPeso()
	{
		return peso;
	}
	public void setPeso(double valor)
	{
		peso=valor;
	}
	////////////////////////////////////
	public double getAlt()
	{
		return alt;
	}
	public void setAlt(double valor)
	{
		alt=valor;
	}

	
	////////////// METODOS ///////////////
	
	private double calcularIMC()
	{
		return (peso/(alt*alt));
	}
	
	public String calcularPersonaRiesgo()
	{
		if(edad>=65)
		{
			return "PERSONA EN RIESGO";
		}
		else if(enf == true)
		{
			return "PERSONA EN RIESGO";
		}
		else if(calcularIMC()>30)
		{
			return "PERSONA EN RIESGO";
		}
		
		else
		{
			return "PERSONA SIN RIESGO";
		}
	}
	
	public void imprimirDatos()
	{
		System.out.println("Edad: "+edad);
		System.out.println("Tiene una enfermedad cronica: "+enf);
		System.out.println("Peso: "+peso);
		System.out.println("Altura: "+alt);
	}
	
	
}
