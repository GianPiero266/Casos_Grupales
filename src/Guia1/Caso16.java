package Guia1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);		
		DecimalFormat b = new DecimalFormat("#.00");
		
		float sueldo = 0, bono = 0, total = 0, total_en_dolares = 0;
		
		System.out.print("Ingrese horas trabajadas: ");
		int horas_trabajadas = a.nextInt();
		
		System.out.print("Ingrese tarifa por hora: ");
		float tarifa_por_hora = a.nextFloat();
		
		sueldo = horas_trabajadas * tarifa_por_hora;
		bono = (float)(sueldo * 0.05);
		total = sueldo + bono;
		total_en_dolares = (float)(total / 3.24);
		
		System.out.println("\nResultados");
		System.out.println("Sueldo: " + b.format(sueldo));
		System.out.println("Bono: " + b.format(bono));
		System.out.println("Total: " + b.format(total));
		System.out.println("Total en dólares: " + b.format(total_en_dolares));
	}

}

