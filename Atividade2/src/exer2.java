import java.util.Scanner;

public class exer2 {
	public static void main(String args[]){
		int x,y;
		int soma,media;

		
		
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		x = scn.nextInt();
		System.out.println("Digite o segundo numero: ");
		y = scn.nextInt();
		
		
		System.out.printf("%s %s %n","A soma de x e y é:",soma = x+y,"/n");
		System.out.printf("%s %s %n","A media de x e y é:",media = soma/2,"/n");
		if(x <= y){
			System.out.printf("%s %s %s %n","ordem crescente:",x,y,"/n");
		}
		else{
			System.out.printf("%s %s %s %n","ordem crescente:",y,x,"/n");
		}
		
		
	}

}
