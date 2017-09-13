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
public class exer2 {
    
    public static void main(String[] args) {
		int numeros[]  = new int[2];
		int i;
                double soma;
		
		
		String x;
		Scanner scn = new Scanner(System.in);
                System.out.println("P1 = R$1,00, Codigo 00:");
                System.out.println("P2 = R$2.98, Codigo 11:");
                System.out.println("P3 = R$9.98, Codigo 22:");
                System.out.println("P4 = R$4.49, Codigo 33:");
		System.out.println("Digite 4 numeros para serem criptodrafados:");
		x = scn.next();
		
		while (true) {
		if(x.length()== 4){
			break;
		}
		else{
			System.out.println("Digite novamente:");
			x = scn.next();
		}
		}
		
		String[] string = {x.substring(0, 2),x.substring(2)};
		for(i=0;i < 2;i++){
			numeros[i] = Integer.valueOf(string[i]);
		}
                soma = Leitura(numeros);
	
		System.out.printf("%.2f",soma);
	
	}
	
	public static double Leitura(int[] numeros) {
		double soma = 0;
                if(numeros[0] == 00){
                   soma = 1 * numeros[1];
                
                }
                else if(numeros[0] == 11){
                    soma = 2.98 * numeros[1];
                    
                }
                else if(numeros[0] == 22){
                    soma = 9.98 * numeros[1];
                
                
                }
                else if(numeros[0] == 33){
                    soma = 4.49 * numeros[1];
                    
                }
                
                return soma;
	

	}
    
}
