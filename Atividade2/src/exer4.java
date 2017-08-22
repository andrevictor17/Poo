import java.util.Scanner;

	public class exer4 {
		public static void main(String args[]){
			int x,y;
			int mult;

			
		
		
		
			Scanner scn = new Scanner(System.in);
			System.out.println("Digite o primeiro numero: ");
			x = scn.nextInt();
			System.out.println("Digite o segundo numero: ");
			y = scn.nextInt();
			
			mult = x%y;
			if(mult == 0 ){
				System.out.printf("%s %s %s %n",x,"é multiplo de:",y,"/n");
			}
			else{
				System.out.printf("%s %s %s %n",x,"nao é multiplo de:",y,"/n");
			}
			
		
	}
}
