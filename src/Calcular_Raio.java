import java.util.Scanner;

public class Calcular_Raio {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o raio da circuferencia: ");
		Double raio = ent.nextDouble();
		//Elevando o numero
		Double resultadoraio = raioVezesRaio(raio);
		//Calculo da area
		Double resultado = calculandoRaioVezesPi(resultadoraio);
		System.out.printf("A area do circulo é %2.2f: ", resultado);
		ent.close();
	}
	
	public static Double raioVezesRaio(Double raio) {
		return (raio*raio);
		
	}
	
	public static Double calculandoRaioVezesPi(Double resultadoraio) {
		double pi = Math.PI;
		return pi * resultadoraio;
		
	}
	
	
	
	

}
