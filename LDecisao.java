package Turma28;
 
import java.util.Scanner;

public class LDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/* Fa�a um programa que leia a idade de uma pessoa e mostre na sa�da em qual categoria
	    ela se encontra:
	    10-14 infantil
	    15-17 juvenil
	    18-25 adulto*/
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nInforme a idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14 )
		{
			System.out.print("\nSua categoria � infantil");
		}
		else if(idade>=15 && idade <=17 )
		{
			System.out.print("\nSua categoria � juvenil");
		}
		else if(idade>=18 && idade<=25 ) 
		{
			System.out.print("\nSua categoria � Adulto ");
		}
		else 
		{
			System.out.print("\nN�o existe categoria para a idade inserida ");
		}
		
		
			
	}
	
	
	
	
	
	
          
	    
	    
	    
	  
	    

}
