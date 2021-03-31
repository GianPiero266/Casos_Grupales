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
		ArrayList<String> arrContrase�a = new ArrayList<String>();
		ArrayList<Integer> arrSaldo = new ArrayList<Integer>();
		ArrayList<String> arrMovimientos = new ArrayList<String>();
		
		String nombre = "", usuario = "", contrase�a = "", validar_contrase�a = "";
		String continuar = "Si", usuario1 = "", contrase�a1 = ""; 
		int opcion = 0, a�o_de_nacimiento, saldo = 0;
		
		arrNombre.add("Alex");
		arrNombre.add("Gian Piero");
		arrNombre.add("Karla");
		arrNombre.add("Daniel");
		
		arrUsuario.add("A-0710");
		arrUsuario.add("G-1321");
		arrUsuario.add("K-1721");
		arrUsuario.add("D-2528");
		
		arrContrase�a.add("senatialex");
		arrContrase�a.add("senatigianpiero");
		arrContrase�a.add("senatikarla");
		arrContrase�a.add("senatidaniel");
		
		arrMovimientos.add("No haz realizado ning�n movimiento");
		arrMovimientos.add("No haz realizado ning�n movimiento");
		
		arrSaldo.add(2875);
		arrSaldo.add(1950);
		arrSaldo.add(2340);
		arrSaldo.add(4269);
		
		System.out.println(arrNombre);
		System.out.println(arrUsuario);
		System.out.println(arrContrase�a);
		System.out.println(arrSaldo);		
		
		while(continuar.equalsIgnoreCase("Si")) {
			System.out.println("Bienvenido al cajero\n");
			System.out.print("1. Crear cuenta\n" 
							 + "2. Ingresar\n\n"
							 + "Ingresa el n�mero de la operaci�n que deseas realizar: ");
			opcion = a.nextInt();
			
			a.nextLine();
			
			if (opcion == 1) {
				System.out.print("\nIngresa los siguientes datos para crear una cuenta\n\n"
								 + "A�o de nacimiento. Ej. 1995: ");
				a�o_de_nacimiento = a.nextInt();
				a.nextLine();
				
				if (a�o_de_nacimiento <= 2003) {
					System.out.print("Nombre: ");
					nombre = a.nextLine();
					System.out.print("Usuario. Ej. A-4512: ");
					usuario = a.nextLine();
					
					int j = 0;
					
					while(j == 0) {
						System.out.print("Contrase�a: ");
						contrase�a = a.nextLine();
						System.out.print("Confirmar contrase�a: ");
						validar_contrase�a = a.nextLine();
						if (contrase�a.equals(validar_contrase�a)) {
							System.out.println("Se ha creado la cuenta exitosamente");
							
							arrNombre.add(nombre);
							arrUsuario.add(usuario);
							arrContrase�a.add(contrase�a);
							saldo = 0;
							arrSaldo.add(saldo);
							
							j = 1;
						}
						else 
							System.out.println("Las contrase�as no coinciden, vuelva a ingresarlas\n");
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
					
			System.out.print("Contrase�a: ");
			contrase�a1 = a.nextLine();
			
				for(int i = 0; i < arrUsuario.size(); i++) {
					
					if (arrUsuario.get(i).equals(usuario1) && arrContrase�a.get(i).equals(contrase�a1)) {
						while (continuar.equalsIgnoreCase("si")) {
							System.out.println("\nBienvenid@ " + arrNombre.get(i) + "\n");
							System.out.print("1. Ver Saldo\n"
										   + "2. Depositar\n"
										   + "3. Transferir\n"
										   + "4. Retirar\n"
										   + "5. �ltimos movimientos\n"
										   + "6. Cambiar clave\n"
										   + "\nIngresa el n�mero de la operaci�n que deseas realizar: ");
							opcion = a.nextInt(); 
						
							switch (opcion) {
						 		case 1:
						 			System.out.println("Su saldo acual es de S/. " + arrSaldo.get(i));
						 			a.nextLine();
						 			arrMovimientos.add("Revisaste el saldo que ten�as disponible");
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
						 			arrMovimientos.add("Realizaste un dep�sito de " + "S/." + String.valueOf(deposito));
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
						 							 + "Ingrese el n�mero de la operaci�n que desea realizar: ");
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
						 						System.out.println("El monto ingresado no es v�lido\n"
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
						 				System.out.println("La opci�n ingresada no es v�lida\n"
						 								 + "Le pediremos los datos nuevamente");
						 			}
						 			}
						 			break;
						 			
						 		case 5:
						 			System.out.println("Se mostrar�n los 02 �ltimos movimientos realizados en tu cuenta\n\n"
						 							 + "1. " + arrMovimientos.get(arrMovimientos.size()-1) + "\n"
						 							 + "2. " + arrMovimientos.get(arrMovimientos.size()-2) + "\n");
						 			arrMovimientos.add("Revisaste tus ultimos movimientos");
						 			break;
						 			
						 		case 6:
						 			a.nextLine();
						 			System.out.print("Ingrese los siguientes datos\n"
						 						   + "\nNueva clave: ");
						 			validar_contrase�a = a.nextLine();
						 			arrContrase�a.set(i, validar_contrase�a);
						 			System.out.println("Se cambio su contrase�a exitosamente");
						 			System.out.println("Presione la tecla enter para continuar");
						 			arrMovimientos.add("Realizaste un cambio de contrase�a");
						 			break;
						 			
						 		default:
						 			System.out.println("Ingresaste una opci�n inv�lida\n");
						 			break;
							}
							
							a.nextLine();
							System.out.print("�Desea realizar otra operaci�n dentro de su cuenta? [Si / No]: ");
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
						System.out.println("La clave y/o contrase�a son incorrectas");
					
				}
		
			}
			
			else if (opcion != 1 && opcion != 2) {
				System.out.println("Ingresaste una opci�n inv�lida");
			}
			
			
			System.out.println("");
			System.out.print("�Deseas realizar otra operaci�n en el cajero? [Si / No]: ");
			continuar = a.nextLine();
			System.out.println("");
					
		}
		
		System.out.println("Gracias por usar nuestro sistema");
	}//2

}//1

