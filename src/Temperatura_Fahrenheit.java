import java.util.Scanner;

//Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, 
//transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).
public class Temperatura_Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		Double tempF, Cel;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		tempF = ent.nextDouble();
		
		Cel = 5 * ((tempF-32) / 9);
		
		System.out.printf("A tempera em Celsius �: %2.2f", Cel);
		
		ent.close();
		
	}

}
