import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		int num_conta,saldo,cobre,credito,limite,novo_saldo;
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite numero da conta: ");
		num_conta = scn.nextInt();
		System.out.println("Digite saldo no in�cio do m�s: ");
		saldo= scn.nextInt();
		System.out.println("Digite o total de todos os itens cobrados desse cliente no m�s: ");
		cobre = scn.nextInt();
		System.out.println("Digite o total de cr�ditos aplicados ao cliente no m�s: ");
		credito = scn.nextInt();
		System.out.println("Digite o limite de cr�dito autorizado: ");
		limite = scn.nextInt();
		novo_saldo = (saldo + cobre)-credito ;
		
		System.out.printf("%s %s %n","o novo saldo �:",novo_saldo,"/n");
		if(novo_saldo> limite){
			System.out.printf("%s %n","o novo saldo excede o limite:","/n");
		}
		else{
			System.out.printf("%s %n","o novo saldo nao excede o limite:","/n");
		}
}
}