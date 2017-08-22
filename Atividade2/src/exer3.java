import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class exer3 {
	
	public static void main(String args[]){
		int[] numeros;
		numeros = new int[5];
		int maior,menor,i; 
		
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numeros[0] = scn.nextInt();
		System.out.println("Digite o segundo numero: ");
		numeros[1] = scn.nextInt();
		System.out.println("Digite o terceiro numero: ");
		numeros[2] = scn.nextInt();
		System.out.println("Digite o quarto numero: ");
		numeros[3] = scn.nextInt();
		System.out.println("Digite o quinto numero: ");
		numeros[4] = scn.nextInt();
		
		
		maior = numeros[0];
		menor = numeros[0];
		for(i=0;i <5;i++){
			if(maior <= numeros[i]){
				maior = numeros[i];
			}
			else if(menor >=numeros[i]){
				menor = numeros[i];
			}
			
		}
		
		System.out.printf("%s %s %n","Maior:",maior,"/n");
		System.out.printf("%s %s %n","Menor:",menor,"/n");
		
		
	}
	
}
