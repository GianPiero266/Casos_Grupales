package Guia1;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Ingrese lado 1: ");
      int l1 = sc.nextInt();
      
      System.out.println("Ingrese lado 2: ");
      int l2 = sc.nextInt();
      
      int area = (int) l1*l2;
      int perimetro = (int) l1+l1+l2+l2;
      
      System.out.println("--------------------------");
      System.out.println("Resultados");
      System.out.println("--------------------------");
      System.out.println("Área del rectangulo: " + area);
      System.out.println("Perímetro del rectangulo: " + perimetro);
	}	
}

