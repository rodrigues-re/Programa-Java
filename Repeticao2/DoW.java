package Turma28;

import java.util.Scanner;

public class DoW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero 
		  igual a zero. No final, mostre a soma dos n�meros digitados*/
		 
			
		        int n=0, soma=0;
		        Scanner ler = new Scanner(System.in);
			
		        do {
		        	System.out.print("\nInforme um n�mero: ");
		        n = ler.nextInt();
		        soma = soma+n;
		        
		        }
		        while(n!=0);
		        
		       System.out.print("\nA soma total dos n�meros informados �:" +soma);
		        
		        
	}

}
