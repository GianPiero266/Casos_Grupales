package Guia1;

import java.util.Scanner;

public class Caso5 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	float n1= 0 , n2 = 0;
	
	System.out.println("Ingrese Primer número: ");
	int p1 = sc.nextInt();
	
	System.out.println("Ingrese Segundo número: ");
	int p2 = sc.nextInt();
	
	 float promedio = (p1 + p2) / 2;
	 float aumentou = (float) (p1 + (0.2 * p1));
	 float aumentod = (float) (p2 - (p2 * 0.3));
	
	System.out.println("-----------");
	System.out.println("RESULTADOS");
	System.out.println("----------");
	System.out.println("resultado 1: " + promedio );
	System.out.println("resultado 2: " + aumentou);
	System.out.println("resultado 3: " + aumentod);
	
	

}
}
