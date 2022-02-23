import java.util.Scanner;

public class Cubo_calculo {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Calculo ao Cubo");
		System.out.println("Digite um numero");
		Integer num = ent.nextInt();
		String esc;
		Integer resultado = num * num * num;
		
		System.out.println("Gostaria de ver resultado?");
		 
		esc = ent.nextLine();
		
		if (esc == "s") {
			System.out.printf("O resultado do %s é %s", num, resultado);
		}else if (esc == "n"){
			System.out.println("Okay...");
		}else {
			System.out.println("Digte s/n, por gentileza");
		}
		
		ent.close();
		
	}
		
}
