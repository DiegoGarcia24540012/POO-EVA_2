package ej16;

public class Direccion
{
	private String calle;
	private int numero;
	private String colonia;
	private int cp;
	
	public Direccion(String calle, int numero, String colonia, int cp)
	{
		this.calle = calle;
		this.numero = numero;
		this.colonia = colonia;
		this.cp = cp;
	}
	
	public Direccion()
	{
		this.calle = "#####";
		this.numero = 0;
		this.colonia = "#####";
		this.cp = 0;
	}
	
	////////////////////////////////////////

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
	
}
