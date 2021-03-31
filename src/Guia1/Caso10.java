package Guia1;

import java.util.Scanner;

public class Caso10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el radio: ");
		float r = sc.nextInt();
		
		float area = (float) 3.14 * (r*r);
		float perimetro = (float) (2*3.14)*(r);
		
		System.out.println("------------------");
		System.out.println("Resultados");
		System.out.println("------------------");
		System.out.println("El área es: " + area);
		System.out.println("El perímetro es: " + perimetro);
		
	

}
}