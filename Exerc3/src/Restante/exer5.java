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
public class exer5 {
    
     public static void main(String[] args) {
		int numeros[]  = new int[1000];
		int i;
             
		for(i = 0;i < 1000;i++){
                    numeros[i] = i;       
                }
                
                Primo(numeros);

	}
	
	public static void Primo(int[] numeros) {
            
            int cont = 0,resto = 0;
                for(int i = 1;i < 1000;i++){
                    
                    for(int y = 1;y <=i;y++){
                        resto = (i%y);
                        if(resto == 0 ){
                            cont ++;
                        }
                    }
                    if(cont == 2){
                        System.out.println(numeros[i]);
                    }
                    cont = 0;
                    resto = 0;

                }
      
        }

}
