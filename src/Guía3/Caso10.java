package Guía3;

import java.util.Scanner;

public class Caso10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		String continuar= "S",p_ma="",p_m="",e_i="",t_fx="";
		int contador=0;
		double descuento=0, bonificación=0,sb=0, sn=0, alcanzado=0,num_mayor=0,num_menor=999999999,meta=0,t_fi=0;
		
		while (continuar.equals("S") || continuar.equals("s")) {
		    contador++;
		    System.out.println("Empleado " + contador + " : ");
		    String e = sc.nextLine();
		
		    System.out.println("Horas de trabajo: ");
		    float h = sc.nextFloat();
		
		    System.out.println("Tarifa por hora: ");
		    float th = sc.nextFloat();
		
		    System.out.println("Minutos de tardanza: ");
		    float mt = sc.nextFloat();
		
		    sb = th * h;
		
		    if (h<=50) {
			    bonificación=0;}
		    if (h>50 && h<=60) {
				   bonificación=sb*0.02;
				}
		    if (h>60 && h<=70 ) {
				bonificación=sb*0.08;
			}
		    if (h>70 && h<=80) {
				bonificación=sb*0.13;
			}
		    
		    if (h>80) {
				bonificación=sb*0.15;
			}
			
			if (mt>=15) {
				descuento=0;
			}
			
			if (mt>15 && mt<=30) {
				descuento=((sb*0.3)/100)*mt;
			}
			
			if (mt>30) {
				descuento=((sb*0.5)/100)*mt;
			}
			
			sn=(sb+bonificación)-descuento;
		    
		    alcanzado=h/80*100;
		    
		    if (sn>num_mayor) {
		    	num_mayor=sn;
		    	p_ma=e;
		    	
		    }
		    
		    if (sn<num_menor) {
		    	num_menor=sn;
		    	p_m=e;
		    }
		    
		    if (alcanzado>90) {
		    	meta++;
		    }
		    
		    if (mt>t_fi) {
		    	t_fi=mt;
		    	t_fx=e;
		    	
		    }
		    
		    
		   
		    System.out.println("**************************");
		    System.out.println("   RESULTADOS   ");
		    System.out.println("**************************");
		    System.out.println("Sueldo bruto: " + sb);
		    System.out.println("Bonificación: " + bonificación);
		    System.out.println("Descuento: " + descuento);
		    System.out.println("Sueldo neto: " + sn);
		    System.out.println("% Alcanzado: " + alcanzado + " %");
		    
		    sc.nextLine();
		    
		    System.out.println("¿Nuevo empleado? [S/N]");
		    continuar = sc.nextLine();
		
		
		}
		
		System.out.println("Número de empleados: " + contador);
		System.out.println("Sueldo neto mayor: " + num_mayor + " pertenece a: " + p_ma);
		System.out.println("Sueldo neto menor: " + num_menor + " pertenece a : " + p_m);
	    System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + t_fx + " ( " + t_fi + " min " + " ) ");
        System.out.println("Cantidad de empleados con más del 90% de la meta: " + meta);	
	}
	
}
