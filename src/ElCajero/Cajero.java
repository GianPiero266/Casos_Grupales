package ElCajero;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Cajero {//1

	public static void main(String[] args) {//2
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		ArrayList<String> arrNombre = new ArrayList<String>();
		ArrayList<String> arrUsuario = new ArrayList<String>();
		ArrayList<String> arrContraseña = new ArrayList<String>();
		ArrayList<Integer> arrSaldo = new ArrayList<Integer>();
		ArrayList<String> arrMovimientos = new ArrayList<String>();
		
		String nombre = "", usuario = "", contraseña = "", validar_contraseña = "";
		String continuar = "Si", usuario1 = "", contraseña1 = ""; 
		int opcion = 0, año_de_nacimiento, saldo = 0;
		
		arrNombre.add("Alex");
		arrNombre.add("Gian Piero");
		arrNombre.add("Karla");
		arrNombre.add("Daniel");
		
		arrUsuario.add("A-0710");
		arrUsuario.add("G-1321");
		arrUsuario.add("K-1721");
		arrUsuario.add("D-2528");
		
		arrContraseña.add("senatialex");
		arrContraseña.add("senatigianpiero");
		arrContraseña.add("senatikarla");
		arrContraseña.add("senatidaniel");
		
		arrMovimientos.add("No haz realizado ningún movimiento");
		arrMovimientos.add("No haz realizado ningún movimiento");
		
		arrSaldo.add(2875);
		arrSaldo.add(1950);
		arrSaldo.add(2340);
		arrSaldo.add(4269);
		
		System.out.println(arrNombre);
		System.out.println(arrUsuario);
		System.out.println(arrContraseña);
		System.out.println(arrSaldo);		
		
		while(continuar.equalsIgnoreCase("Si")) {
			System.out.println("Bienvenido al cajero\n");
			System.out.print("1. Crear cuenta\n" 
							 + "2. Ingresar\n\n"
							 + "Ingresa el número de la operación que deseas realizar: ");
			opcion = a.nextInt();
			
			a.nextLine();
			
			if (opcion == 1) {
				System.out.print("\nIngresa los siguientes datos para crear una cuenta\n\n"
								 + "Año de nacimiento. Ej. 1995: ");
				año_de_nacimiento = a.nextInt();
				a.nextLine();
				
				if (año_de_nacimiento <= 2003) {
					System.out.print("Nombre: ");
					nombre = a.nextLine();
					System.out.print("Usuario. Ej. A-4512: ");
					usuario = a.nextLine();
					
					int j = 0;
					
					while(j == 0) {
						System.out.print("Contraseña: ");
						contraseña = a.nextLine();
						System.out.print("Confirmar contraseña: ");
						validar_contraseña = a.nextLine();
						if (contraseña.equals(validar_contraseña)) {
							System.out.println("Se ha creado la cuenta exitosamente");
							
							arrNombre.add(nombre);
							arrUsuario.add(usuario);
							arrContraseña.add(contraseña);
							saldo = 0;
							arrSaldo.add(saldo);
							
							j = 1;
						}
						else 
							System.out.println("Las contraseñas no coinciden, vuelva a ingresarlas\n");
					}
				}
				else {
					System.out.println("Tienes que ser mayor de edad");
				}
			}
			
			if (opcion == 2) {
				
			System.out.println("\nIngrese los siguientes datos");
			System.out.print("Usuario: ");
			usuario1 = a.nextLine();
					
			System.out.print("Contraseña: ");
			contraseña1 = a.nextLine();
			
				for(int i = 0; i < arrUsuario.size(); i++) {
					
					if (arrUsuario.get(i).equals(usuario1) && arrContraseña.get(i).equals(contraseña1)) {
						while (continuar.equalsIgnoreCase("si")) {
							System.out.println("\nBienvenid@ " + arrNombre.get(i) + "\n");
							System.out.print("1. Ver Saldo\n"
										   + "2. Depositar\n"
										   + "3. Transferir\n"
										   + "4. Retirar\n"
										   + "5. Últimos movimientos\n"
										   + "6. Cambiar clave\n"
										   + "\nIngresa el número de la operación que deseas realizar: ");
							opcion = a.nextInt(); 
						
							switch (opcion) {
						 		case 1:
						 			System.out.println("Su saldo acual es de S/. " + arrSaldo.get(i));
						 			a.nextLine();
						 			arrMovimientos.add("Revisaste el saldo que tenías disponible");
						 			System.out.println("Presione la tecla enter para continuar");
						 			break;
						 			
						 		case 2:
						 			System.out.print("Ingrese los siguientes datos\n\n"
						 						   + "Monto a depositar: ");
						 			int deposito = a.nextInt();
						 			int nuevo_monto = arrSaldo.get(i) + deposito;
						 			arrSaldo.set(i, nuevo_monto);
						 			System.out.println("El dinero fue depositado correctamente");
						 			System.out.println("Su nuevo saldo es de S/." + arrSaldo.get(i));
						 			System.out.println("");
						 			arrMovimientos.add("Realizaste un depósito de " + "S/." + String.valueOf(deposito));
						 			break;
						 			
						 		case 3:
						 			a.nextLine();
						 			while(opcion == 3) {
						 				System.out.print("Ingrese los siguiene datos\n\n"
						 				                 + "Usuario al que desea transferir. Ej. A-7845: ");
						 				usuario1 = a.nextLine();
						 				for(int j = 0; j < arrUsuario.size(); j++) {
						 					if (arrUsuario.get(j).equals(usuario1)){
						 						
						 						while(opcion == 3) {
						 							System.out.print("Ingrese el monto a transferir: ");
						 							int monto_a_transferir = a.nextInt();
						 							
						 							if (monto_a_transferir <= arrSaldo.get(i)) {
						 					
						 								nuevo_monto = arrSaldo.get(j) + monto_a_transferir;
						 								arrSaldo.set(j, nuevo_monto);
						 					
						 								nuevo_monto = arrSaldo.get(i) - monto_a_transferir;
						 								arrSaldo.set(i, nuevo_monto);
						 					
						 								System.out.println("El monto ha sido transferido exitosamente\n"
						 												 + "Su saldo actual es de " + "S/." + nuevo_monto + "\n");
						 								arrMovimientos.add("Realizaste un transferencia de " + "S/." +  String.valueOf(monto_a_transferir) + " al usuario " + usuario1);
						 								opcion = 0;
						 							}
						 							else {
						 								System.out.println("El monto que desea transferir es mayor al saldo que usted tiene\n"
						 												 + "Le pediremos nuevamente los datos\n");
						 							}
						 						}
						 						break;
						 					}
						 					else if (j + 1 == arrUsuario.size())
						 						System.out.println("\nEl usuario ingresado no esta registrado\n"
						 										 + "Asegurese de haber ingresado el nombre de usuario correcto\n"
						 										 + "Vuelva a ingresar los datos que le pediremos\n");
						 				}
						 			}
						 			//
						 			//
						 			break;
						 			
						 		case 4:
						 			while (opcion == 4) {
						 			System.out.print("\n1. Retirar [S/.20.00 - S/.50.00 - S/.100.00 - S/.200.00]\n"
						 							 + "2. Otro monto\n\n"
						 							 + "Ingrese el número de la operación que desea realizar: ");
						 			int opcion1 = a.nextInt();
						 			
						 			
						 			if (opcion1 == 1) {
						 				while (opcion == 4) {
						 					System.out.print("Ingrese los siguientes datos\n\n"
						 							 	   + "Monto a retirar en valores de [S/.20.00 - S/.50.00 - S/.100.00 - S/.200.00]: ");
						 					int retiro = a.nextInt();
						 			
						 					if (retiro == 20 || retiro == 50 || retiro == 100 || retiro == 200) {
						 						if (retiro <= arrSaldo.get(i)) {
						 							nuevo_monto = arrSaldo.get(i) - retiro;
						 							arrSaldo.set(i, nuevo_monto);
						 							System.out.println("Monto retirado exitosamente\n"
						 										     + "Su saldo actual es de " + "S/." + nuevo_monto + "\n");
						 							arrMovimientos.add("Realizaste un retiro de " + "S/." + String.valueOf(retiro));
						 							opcion = 0;
						 						}
						 						else {
						 							System.out.println("El monto que desea retirar es mayor al saldo que usted tiene\n"
						 										 + "Le pediremos nuevamente los datos\n");
						 						}
						 					}
						 				
						 					else {
						 						System.out.println("El monto ingresado no es válido\n"
						 									     + "Le pediremos nuevamente los datos\n");
						 					}
						 				}
						 			}
						 			
						 			else if (opcion1 == 2) {
						 				while (opcion == 4) {
						 					System.out.print("Ingrese los siguientes datos\n\n"
						 							 	   + "Monto a retirar: ");
						 					int retiro = a.nextInt();
						 			
						 					if (retiro <= arrSaldo.get(i)) {
						 						nuevo_monto = arrSaldo.get(i) - retiro;
						 						arrSaldo.set(i, nuevo_monto);
						 						System.out.println("Monto retirado exitosamente\n"
						 									     + "Su saldo actual es de " + "S/." + nuevo_monto + "\n");
						 						arrMovimientos.add("Realizaste un retiro de " + "S/." + String.valueOf(retiro));
						 						opcion = 0;
						 					}
						 					else {
						 						System.out.println("El monto que desea retirar es mayor al saldo que usted tiene\n"
						 									     + "Le pediremos nuevamente los datos\n");
						 					}
						 					
						 				}
						 			}
						 			
						 			else {
						 				System.out.println("La opción ingresada no es válida\n"
						 								 + "Le pediremos los datos nuevamente");
						 			}
						 			}
						 			break;
						 			
						 		case 5:
						 			System.out.println("Se mostrarán los 02 últimos movimientos realizados en tu cuenta\n\n"
						 							 + "1. " + arrMovimientos.get(arrMovimientos.size()-1) + "\n"
						 							 + "2. " + arrMovimientos.get(arrMovimientos.size()-2) + "\n");
						 			arrMovimientos.add("Revisaste tus ultimos movimientos");
						 			break;
						 			
						 		case 6:
						 			a.nextLine();
						 			System.out.print("Ingrese los siguientes datos\n"
						 						   + "\nNueva clave: ");
						 			validar_contraseña = a.nextLine();
						 			arrContraseña.set(i, validar_contraseña);
						 			System.out.println("Se cambio su contraseña exitosamente");
						 			System.out.println("Presione la tecla enter para continuar");
						 			arrMovimientos.add("Realizaste un cambio de contraseña");
						 			break;
						 			
						 		default:
						 			System.out.println("Ingresaste una opción inválida\n");
						 			break;
							}
							
							a.nextLine();
							System.out.print("¿Desea realizar otra operación dentro de su cuenta? [Si / No]: ");
							continuar = a.nextLine();
							
							if (continuar.equalsIgnoreCase("No")){
								try {
									archivo = new FileWriter("info.txt", true);
									pw = new PrintWriter(archivo);
									
									pw.println("MOVIMIENTOS REALIZADOS");
									pw.println("----------------------\n");
									
									if (arrMovimientos.size() == 3) {
										pw.println("1. " + arrMovimientos.get(2));
									}
									
									else if (arrMovimientos.size() > 3)
										for (int k = 2; k < arrMovimientos.size(); k++) {
											pw.println((k - 1) + ". " + arrMovimientos.get(k));
									}
									
									System.out.println("Se ha creado un voucher con todos los movimientos que ha realizado en el cajero");
								}
								catch(Exception ex1) {
									// Imprimir el detalle del error
									ex1.printStackTrace();
								}
								finally {
									//Cierre del archivo
									try {
										if (archivo != null) archivo.close();
									}
									catch (Exception ex2){
										ex2.printStackTrace();
									}
								}
							}
						}
						
					break;
					}
					
					if (i + 1 == arrUsuario.size())
						System.out.println("La clave y/o contraseña son incorrectas");
					
				}
		
			}
			
			else if (opcion != 1 && opcion != 2) {
				System.out.println("Ingresaste una opción inválida");
			}
			
			
			System.out.println("");
			System.out.print("¿Deseas realizar otra operación en el cajero? [Si / No]: ");
			continuar = a.nextLine();
			System.out.println("");
					
		}
		
		System.out.println("Gracias por usar nuestro sistema");
	}//2

}//1

