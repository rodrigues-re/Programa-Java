package Turma28;

import java.util.Scanner;

public class Array1 {
	 /*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	 � Os n�meros pares digitados;  
	 � A soma dos n�meros pares digitados; 
	 � Os n�meros �mpares digitados; 
	 � A quantidade de n�meros �mpares digitados.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] numero = new int[6];
	      int y, somap=0;
	     
	      Scanner leia = new Scanner(System.in);
	      
	      for(y=0;y<6;y++) 
	      {
	    	  System.out.println("\nDigite um n�mero :");
	    	  numero[y] = leia.nextInt();
	      }
	       for(y=0;y<6;y++) 
	       {
	    	   if(numero[y] % 2 == 0) 
	    	   {
	    		   System.out.println("\n"+numero[y]+" par..");
	    		   somap = somap + numero[y];
	    	   }
	       
	    	   else 
	    	   {
	    		   System.out.println("\n"+numero[y]+" �mpar..");
	    	   }
	       }
	      System.out.println("\nA soma dos pares digitados �: "+somap); 
	      System.out.println("\nA quantidade dos �mpares �: "+y);    
	       
	      
	       
	}
	

}
