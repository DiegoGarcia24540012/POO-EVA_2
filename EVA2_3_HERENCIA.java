package ej3;

public class EVA2_3_HERENCIA
{

	public static void main(String[] args)
	{
		Empleado empleado = new Empleado();
		empleado.setNombres("Juan");
		System.out.println("Nombre: "+empleado.getNombres());
		empleado.setClave(100);
		System.out.println("Clave: "+empleado.getClave()+"\n");
		
		Proveedor prov = new Proveedor();
		prov.setNombres("SONY");
		prov.setCred(false);
		System.out.println("Nombre: "+prov.getNombres());
		System.out.println("Credito: "+prov.getCred()+"\n");
		
		Cliente cliente = new Cliente();
		cliente.setRazon("WALMART");
		System.out.println("Razon social: "+cliente.getRazon());
	}

}
