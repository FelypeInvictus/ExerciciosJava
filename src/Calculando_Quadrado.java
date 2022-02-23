import java.util.Scanner;

public class Calculando_Quadrado {

	public static int dobroLado(int side) {
		
		return (side * 2);
	}

public static int ladoVezesLado(int lado1, int lado2) {
	return (lado1 * lado2);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int lado;
		
		System.out.println("Digite o lado do quadrado: ");
		lado = ent.nextInt();
		
		//Calculo
		int resultado = ladoVezesLado(lado, lado);
		
		System.out.println("A area é: "+ resultado);
		
		System.out.printf("O dobro da area é: %d", dobroLado(resultado));
		
		ent.close();
		
		
	}

}
