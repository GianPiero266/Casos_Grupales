package Guia2;

import java.util.Scanner;

public class Caso15 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cliente: ");
        String c = sc.nextLine();
        
        System.out.println("Producto: ");
        String p = sc.nextLine();
        
        System.out.println("Forma de pago: ");
        String fp = sc.nextLine();     
        
        System.out.println("Cantidad: ");
        int can = sc.nextInt(); 
        
        if (p.equals("TB") || p.equals("tb")) {
        	float valor = 350;
        	System.out.println("Cliente: " + c);
        	System.out.println("Importe: " + (can*valor));
        	
        	if (fp.equals("C1") || fp.equals("c1")) {
        		double desc = valor*0.05;
        		System.out.println("Pago al contado: " + ((can*valor)-desc));
        	}
        	
        	if (fp.equals("C2") || fp.equals("c2")) {
        		double desc = valor*0.12;
        		System.out.println("Crédito: " + ((can*valor) + desc));
        	}
        	
        }
        
        
        if (p.equals("LT") || p.equals("lt")) {
        	float valor = 2300;
        	System.out.println("Cliente: " + c);
        	System.out.println("Importe: " + (can*valor));
        	
        	if (fp.equals("C1") || fp.equals("c1")) {
        		double desc = valor*0.05;
        		System.out.println("Pago al contado: " + ((can*valor)-desc));
        	}
        	
        	if (fp.equals("C2") || fp.equals("c2")) {
        		double desc = valor*0.12;
        		System.out.println("Crédito: " + ((can*valor) + desc));
        		}
        }
        
        if (p.equals("MN") || p.equals("mn")) {
        	float valor = 850;
        	System.out.println("Cliente: " + c);
        	System.out.println("Importe: " + (can*valor));
        	
        	if (fp.equals("C1") || fp.equals("c1")) {
        		double desc = valor*0.05;
        		System.out.println("Pago al contado: " + ((can*valor)-desc));
        	 }
        	
        	if (fp.equals("C2") ||fp.equals("c2"))  {
        		double desc = valor*0.12;
        		System.out.println("Crédito: " + ((can*valor) + desc));
        	 }
        }
        
        if (p.equals("IM") || p.equals("im")) {
        	float valor = 680;
        	System.out.println("Cliente: " + c);
        	System.out.println("Importe: " + (can*valor));
        	
        	if (fp.equals("C1") || fp.equals("c1")) {
        		double desc = valor*0.05;
        		System.out.println("Pago al contado: " + ((can*valor)-desc));
        	}
        	
        	if (fp.equals("C2") || fp.equals("c2")) {
        		double desc = valor*0.12;
        		System.out.println("Crédito: " + ((can*valor) + desc));
        	}
        	}
        }	
	}