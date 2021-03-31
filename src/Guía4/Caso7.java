package Guía4;

import java.util.Scanner;

public class Caso7 {

	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		int x=0;
		
		int [][] numero = new int [3][4];
		
		System.out.println("Lectura de números");
		System.out.println("------------------");
		
		int num_mayor= 0, num_menor=99999999;
		float promedio=0, sumatoria1=0;
		
		for (int f = 0; f < numero.length; f++) {  
		    for (int c = 0; c < numero [0].length; c++) {
		    	x++;
		    	System.out.println("N." + x + " (F " + (f+1) +", " + " C" + (c+1) + ") : ");
		        numero[f][c] = sc.nextInt();		         
		 

		         
		         if (numero [f][c]> num_mayor)
		        	 num_mayor= numero [f][c];
		         
		         if (numero [f][c]< num_menor)
		        	 num_menor=numero [f][c];
		         
		         sumatoria1+=numero [f] [c];
		          
		}
		}
		
		promedio=sumatoria1/12;
		System.out.println("-------------------------");
		System.out.println("R E S U L T A D O S");
		System.out.println("-------------------------");
		System.out.println("Número mayor: " + num_mayor);
		System.out.println("Número menor: " + num_menor);
		System.out.println("Sumatoria: " + sumatoria1);
		System.out.println("Promedio: " + promedio);
		
}
}
