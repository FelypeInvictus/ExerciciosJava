import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Somando {
	public static int Soma(int num, int num1) {
		return (num + num1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite dois numeros");
		num1 = ent.nextInt();
		num2 = ent.nextInt();
		
		System.out.println("A soma é: "+ Somando.Soma(num1, num2));
		
		ent.close();
	}

}
