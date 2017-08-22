import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		int horas,valor;
		double salario;
		
		Scanner scn = new Scanner(System.in);
		System.out.println(" Digite a quantidade de horas trabalhadas: ");
		horas = scn.nextInt();
		
		System.out.println(" Quanto o funcionario recebe por hora: ");
		valor = scn.nextInt();
		salario = horas * valor;
		if (horas<=40){
			System.out.printf("%s %.2f %n","Salário foi: ",salario,"/n");
			
		}
		else 
		{
		salario = salario + ((horas-40)*(valor*0.5));
			System.out.printf("%s %.2f %n","Salário foi: ",salario,"/n");
		}
	}

}
