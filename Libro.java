package ej8;

public class Libro extends FichaApa
{
	
	private String edit;
	
	///////////////////  GET Y SET  ////////////////////

	public String getEdit()
	{
		return edit;
	}

	public void setEdit(String valor)
	{
		edit=valor;
	}
	
	public String toString()
	{
		String cade = super.toString()+". "+getEdit()+".\n\n";
		return cade;
	}
	
}