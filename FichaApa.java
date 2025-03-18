package ej8;

public class FichaApa
{
	
	private String autor;
	private String titulo;
	private int year;
	
	/////////////////  GET y SET  /////////////////
	
	public String getAutor()
	{
		return autor;
	}
	public void setAutor(String valor)
	{
		autor=valor;
	}
	//////////////////////////////////////
	public String getTitulo()
	{
		return titulo;
	}
	public void setTitulo(String valor)
	{
		titulo=valor;
	}
	//////////////////////////////////////
	public int getYear()
	{
		return year;
	}
	public void setYear(int valor)
	{
		year=valor;
	}
	//////////////////////////////////////
	
	public String toString()
	{
		String cade = getAutor()+". ("+getYear()+"). "+getTitulo();
		return cade;
	}
	
}