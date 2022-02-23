import java.util.Scanner;

public class Horas_trabalhadas {

	
//	Faça um Programa que 
//	pergunte quanto você ganha por hora e o número de horas trabalhadas 
//	no mês. Calcule e mostre o total do seu salário no referido mês.
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		Double hora = ent.nextDouble();
		
		System.out.println("Qual o numero de horas trabalhadas?");
		int hora_trab = ent.nextInt();
		
		//Calculo
		
		int hora_dia = (int) (hora * hora_trab);
		//DEBUG
		System.out.println(hora_dia);
		
		//Calculando o mês
		
		int total_do_mes = hora_dia * 30;
		
		System.out.printf("O total do mês é: %s reais", total_do_mes);
		
		ent.close();
	}

}
