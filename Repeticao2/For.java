package Turma28;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leia 10 n�meros e informe quantos s�o pares, e quantos s�o �mpares//
	      
				int y,contpar=0,contimpar=0,num;
			       
				Scanner leia = new Scanner(System.in);
			        
			        for(y=1;y<=10;y++) {
			        	
			        	System.out.print("\nDigite um n�mero: ");
			        	num = leia.nextInt();
			        	
			        	if(num % 2 == 0)
			        	{
			        		num = contpar++;
			        	}
			        	else
			        	{
			        		num = contimpar++;
			        	
			        }
			    
			        
			        	
			        	}
			        
			        System.out.print("\nTotal de pares: " +contpar );
			        System.out.print("\nTotal de �mpares: "+contimpar );
			        
	}

}
