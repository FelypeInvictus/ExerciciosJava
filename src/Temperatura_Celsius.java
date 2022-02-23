import java.util.Scanner;

//(1 °C × 9/5) + 32

public class Temperatura_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		Double tempF, Cel;
		
		System.out.println("Digite a temperatura em Celsius: ");
		Cel = ent.nextDouble();
		
		tempF = (Cel * 9/5) + 32;
				
		
		System.out.printf("A temperatura em Fahrenheit é: %2.2f", tempF);
		
		ent.close();
	}

}
