package ej1;

public class EVA2_1_EXA_PRAC
{
	
	public static void main(String[] args)
	{
		TestCovid test = new TestCovid(50,false,100,1.80);
		TestCovid test2 = new TestCovid();
		
		test.imprimirDatos();
		System.out.println("\n"+test.calcularPersonaRiesgo()+"\n----------------------------------");
		
		test2.imprimirDatos();
		System.out.println("\n"+test2.calcularPersonaRiesgo());
		
	}
	
}
