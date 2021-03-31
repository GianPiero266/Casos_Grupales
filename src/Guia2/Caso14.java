package Guia2;

import java.util.Scanner;

public class Caso14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese nombre: ");
		String n= sc.nextLine();
		
		System.out.println("Carrera: ");
		String ca = sc.nextLine();
		
		System.out.println("Turno [M]/[T]/[N]: ");
		String t= sc.nextLine();
		
		System.out.println("Alumno: " + n);
		
		if (ca.equals("DS") || ca.equals("ds")) {
			int monto = 1500;
			System.out.println("Monto: " + monto);
			
			if (t.equals("M") || t.equals("m")) {
				double desc = monto * 0.1;
				System.out.println("Descuento: " + desc);
				System.out.println("Total: " + (monto-desc));
				System.out.println("Cambio a dólares: " + ((monto-desc)/(3.33)) + "dólares");
			}
			
			if (t.equals("T") || t.equals("t")) {
				double desc = monto * 0.2;
				System.out.println("Descuento: " + desc);
				System.out.println("Total: " + (monto-desc));
				System.out.println("Cambio a dólares: " + ((monto-desc)/(3.33)) + "dólares");
			}
			
			if (t.equals("N") || t.equals("n")) {
				double desc = monto * 0.15;
				System.out.println("Descuento: " + desc);
				System.out.println("Total: " + (monto-desc));
				System.out.println("Cambio a dólares: " + ((monto-desc)/(3.33)) + "dólares");
			}
			else {
				 System.out.println("Turno no válido");
			}
		}
		
		if (ca.equals("RC" ) || ca.equals("rc")) {
			int monto = 1400;
			System.out.println("Monto: " + monto);
			
			if (t.equals("M") || t.equals("m")) {
				double desc = monto * 0.1;
				System.out.println("Descuento: " + desc);
				System.out.println("Total: " + (monto-desc));
				System.out.println("Cambio a dólares: " + ((monto-desc)/(3.33)) + "dólares");
			}
			
			if (t.equals("T") || t.equals("t")) {
				double desc = monto * 0.2;
				System.out.println("Descuento: " + desc);
				System.out.println("Total: " + (monto-desc));
				System.out.println("Cambio a dólares: " + ((monto-desc)/(3.33)) + "dólares");
			}
			
			if (t.equals("N") || t.equals("n")) {
				double desc = monto * 0.15;
				System.out.println("Descuento: " + desc);
				System.out.println("Total: " + (monto-desc));
				System.out.println("Cambio a dólares: " + ((monto-desc)/(3.33)) + "dólares");
				}
			else {
				 System.out.println("Turno no válido");
			}
		}
		
		if (ca.equals("DG") || ca.equals("dg")) {
			int monto = 1300;
			System.out.println("Monto: " + monto);
			
			if (t.equals("M") || t.equals("m")) {
				double desc = monto * 0.1;
				System.out.println("Descuento: " + desc);
				System.out.println("Total: " + (monto-desc));
				System.out.println("Cambio a dólares: " + ((monto-desc)/(3.33)) + "dólares");
			}
			
			if (t.equals("T") || t.equals("t")) {
				double desc = monto * 0.2;
				System.out.println("Descuento: " + desc);
				System.out.println("Total: " + (monto-desc));
				System.out.println("Cambio a dólares: " + ((monto-desc)/(3.33)) + "dólares");
			}
			
			if (t.equals("N") || t.equals("n")) {
				double desc = monto * 0.15;
				System.out.println("Descuento: " + desc);
				System.out.println("Total: " + (monto-desc));
				System.out.println("Cambio a dólares: " + ((monto-desc)/(3.33)) + "dólares");
			}
			else {
				 System.out.println("Turno no válido");
			}
		}
		
		else {
			System.out.println("Carrera no válida");
		}
	}
	

}
