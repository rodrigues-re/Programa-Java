package Turma28;

import java.util.Scanner;

public class Exerc�cio3 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int segundos,horas,minutos;
         
         Scanner leia = new Scanner(System.in);
         
         System.out.println("\nTempo com dura��o em segundos: ");
                 segundos = leia.nextInt();
                 horas = (segundos / 3600);
        		 minutos = (segundos % 3600)/60; 
        		 segundos = (segundos % 3600) % 60;
        		 
        	 System.out.println("\nTotal de horas "+ horas +" horas "+ minutos +" minutos "+ segundos +" segundos ");
         
         
	}

}
