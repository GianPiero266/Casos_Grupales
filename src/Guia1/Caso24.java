package Guia1;

import java.util.Scanner;

public class Caso24 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Primer monto: ");
	float p1 = sc.nextFloat();
	
	System.out.println("Segundo monto: ");
	float p2 = sc.nextFloat();
	
	System.out.println("Tercer monto: ");
	float p3 = sc.nextFloat();
	
	
	double problema_1= (float) (p1/5)+(p2*0.2);
	
	double problema_2= (float) (p3*0.3);
	
	double problema_3= (float) (p1+p2+p3)*0.08;
	
	System.out.println("RESULTADOS");
	System.out.println("----------");
	System.out.println("Problema 1: " + problema_1);
	System.out.println("Problema 2: " + problema_2);
	System.out.println("Problema 3: " + problema_3);
	
	
	
	
	
	}

}