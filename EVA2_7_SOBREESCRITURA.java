package ej7;

public class EVA2_7_SOBREESCRITURA
{

	public static void main(String[] args)
	{
		EmpleadoBase eb1 = new EmpleadoBase();
		EmpleadoBase eb2 = new EmpleadoBase("Fulano", "DeTal", 2100.0, "0451", 10);
		
		EmpleadoTemporal et1 = new EmpleadoTemporal();
		EmpleadoTemporal et2 = new EmpleadoTemporal("John", "Doe", 2800.0, 612, 8);
		
		/*
		System.out.println("== Empleado Base 1 ==\n\nNombre: "+eb1.getNombre());
		System.out.println("Apellido: "+eb1.getApellido());
		System.out.println("Clave: "+eb1.getClave());
		System.out.println("Salario: "+eb1.getSalario());
		System.out.println("Bono: "+eb1.getBono()+"\n");
		
		System.out.println("== Empleado Base 2 ==\n\nNombre: "+eb2.getNombre());
		System.out.println("Apellido: "+eb2.getApellido());
		System.out.println("Clave: "+eb2.getClave());
		System.out.println("Salario: "+eb2.getSalario());
		System.out.println("Bono: "+eb2.getBono()+"\n");
		System.out.println("\n");
		
		
		System.out.println("== Empleado Temporal 1 ==\n\nNombre: "+et1.getNombre());
		System.out.println("Apellido: "+et1.getApellido());
		System.out.println("N. de Contrato: "+et1.getContrato());
		System.out.println("Salario: "+et1.getSalario());
		System.out.println("Horas: "+et1.getHoras()+"\n");
		
		System.out.println("== Empleado Temporal 2 ==\n\nNombre: "+et2.getNombre());
		System.out.println("Apellido: "+et2.getApellido());
		System.out.println("N. de Contrato: "+et2.getContrato());
		System.out.println("Salario: "+et2.getSalario());
		System.out.println("Horas: "+et2.getHoras()+"\n");
		*/
		
		System.out.println(eb2+"\n");
		System.out.println(et2+"\n");
	}

}
