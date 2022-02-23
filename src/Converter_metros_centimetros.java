import java.util.Scanner;


/**
 * @author Felype Rangel
 * 
 * DESCRIÇÃO:
 * 
 * Converter metros em centimetros
 *
 */
public class Converter_metros_centimetros {
	
	public static double Metros(double m, double cm ) {
		return (m * cm);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double CENTIMETROS = 100;
		
		Scanner ent = new Scanner (System.in);
		System.out.println("Digite os metros: ");
		double METROS = ent.nextDouble();
		
		double resultado = Metros(METROS, CENTIMETROS);
		
		System.out.printf("O resultado é: %2.2f", resultado);
		
		ent.close();
		
	}

}
