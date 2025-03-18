package ej8;

public class Grabacion extends FichaApa
{
	
	private String album;
	private String label;
	
	//////////////////  GET Y SET  //////////////////
	
	public String getAlbum()
	{
		return album;
	}
	public String getLabel()
	{
		return label;
	}
	
	public void setAlbum(String album)
	{
		this.album = album;
	}
	public void setLabel(String label)
	{
		this.label = label;
	}
	
	public String toString()
	{
		String cade = super.toString()+" [Cancion]. En "+getAlbum()+". "+getLabel()+".\n\n";
		return cade;
	}
	
}