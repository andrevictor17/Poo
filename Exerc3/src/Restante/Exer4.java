/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restante;

import java.util.Scanner;

/**
 *
 * @author andre.rosa
 */
public class Exer4 {
      public static void main(String args[]) {
                double tempo,soma = 2;
                boolean resposta;
                int x,y;
                
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		x = scn.nextInt();
                System.out.println("Digite o segundo numero :");
		y = scn.nextInt();
                
                resposta = multiplo(x,y);
                
                if(resposta == true){
                  	System.out.printf("%s %s %s %n",x,"é multiplo de:",y,"/n");
		}
		else{
			System.out.printf("%s %s %s %n",x,"nao é multiplo de:",y,"/n");
		}
      }
      
      public static boolean multiplo(int x,int y){
         int mult;
         boolean resposta;
         mult = x%y;
         if(mult == 0){
         resposta = true;
         }
         else{
         resposta = false;
         }
         return resposta;
         
      }
}
