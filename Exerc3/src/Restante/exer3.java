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
public class exer3 {
    
    public static void main(String args[]) {
                double tempo,soma = 2;
                int entrada,saida;
                
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite a hora da entrada:");
		entrada = scn.nextInt();
                System.out.println("Digite a hora da saida:");
		saida = scn.nextInt();
                
              tempo = saida - entrada;
           if(tempo > 3){
               soma =  soma +((tempo - 3) *0.5);
           }
           
           System.out.printf("%.2f",soma);
                
    }
    
}
