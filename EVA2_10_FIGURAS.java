package ej10;

public class EVA2_10_FIGURAS
{

	public static void main(String[] args)
	{
		Circulo circulo = new Circulo(5);
		Rectangulo rectangulo = new Rectangulo(10,10);
		
		System.out.println("\n=== CIRCULO ===");
		System.out.println("Area: "+circulo.calcularArea());
		System.out.println("Perimetro: "+circulo.calcularPerimetro());
		
		System.out.println("\n=== RECTANGULO ===");
		System.out.println("Area: "+rectangulo.calcularArea());
		System.out.println("Perimetro: "+rectangulo.calcularPerimetro());
	}

}
