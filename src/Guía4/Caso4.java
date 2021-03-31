package Guía4;

import java.util.Scanner;

public class Caso4 {
	public static void main(String[] args) {
	    Scanner sc= new Scanner (System.in);
	    
	    Integer [] numero= new Integer [5];
	    
	    int num_par=0, num_impar=0;
	    float promedio=0;
	    
        for (int z=0; z<numero.length; z++) {
        	System.out.println("Ingrese número " + (z+1) + " :");
        	numero [z] = sc.nextInt();

        if (numero[z]%2==0) {
        	num_par++;
        }
        
        if (numero[z]%2==1) {
        	num_impar++;
        }
        
        promedio= promedio + numero[z];
        
        }
        
    	
    	System.out.println("-------------------");
    	System.out.println("R E S U L T A D O S");
    	System.out.println("-------------------");
    	System.out.println("Cantidad de números pares: " + num_par);
    	System.out.println("Cantidad de números impares: " + num_impar);
    	System.out.println("Promedio " + (promedio/5));
	    
	    
	    
	}

}