import java.util.Scanner;

public class Horas_trabalhadas {

	
//	Fa�a um Programa que 
//	pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas 
//	no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora?");
		Double hora = ent.nextDouble();
		
		System.out.println("Qual o numero de horas trabalhadas?");
		int hora_trab = ent.nextInt();
		
		//Calculo
		
		int hora_dia = (int) (hora * hora_trab);
		//DEBUG
		System.out.println(hora_dia);
		
		//Calculando o m�s
		
		int total_do_mes = hora_dia * 30;
		
		System.out.printf("O total do m�s �: %s reais", total_do_mes);
		
		ent.close();
	}

}
