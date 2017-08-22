import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
		int[] itens;
		int soma = 0 ,i,x;
		double vendas;
	
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite a quantidade de itens vendidos: ");
		x = scn.nextInt();
		itens = new int[x];
		for(i=0;i<x;i++){
			System.out.println("Adcione o item: ");
			itens[i] = scn.nextInt();
			soma = soma + itens[i];
			
		}
		vendas = 200 +(soma*0.09);
		System.out.printf("%s %.2f %n","o total recebido pelo funcionario é:",vendas,"/n");
		
		
		
		
	}

}
