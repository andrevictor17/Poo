import java.util.Scanner;

public class exe1 {
	
	public static void main(String args[]){
			int x,y;
			int soma ,sub,mult;
			double div;
			
			
			Scanner scn = new Scanner(System.in);
			System.out.println("Digite o primeiro numero: ");
			x = scn.nextInt();
			System.out.println("Digite o segundo numero: ");
			y = scn.nextInt();
			
			System.out.printf("%s %s %n","A soma de x e y é:",soma = x+y,"/n");
			System.out.printf("%s %s %n","A subtração de x e y é:",sub = x-y,"/n");
			System.out.printf("%s %.2f %n","A divisão de x e y é:",div = x/y,"/n");
			System.out.printf("%s %s %n","A multiplicação de x e y é:",mult = x*y,"/n");
			
		}
		

}
