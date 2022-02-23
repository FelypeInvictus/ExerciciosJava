import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int[] notas = new int[4];
		
		int media = 0;
		int soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %s\n", i);
			notas[i] = ent.nextInt();
		}
		
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
			
			media = soma / notas.length;
		}
		
		System.out.println("A media é: " +  media);
		
		ent.close();
	}

}
