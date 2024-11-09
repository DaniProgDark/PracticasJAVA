package main;

import java.util.Scanner;

public class EdadMayorMenor {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		int edad;
		String permisoPadres;
		
		System.out.println("Que edad tienes");
		edad=num.nextInt();
		System.out.println("¿Tienes permiso de tus padres (SI/NO)?: ");
		permisoPadres = num.next();
		
		if(edad>18) {
			System.out.println("Eres mayor de edad puedes acceder");
		}else {
			if(edad >= 16 && edad <=18 && permisoPadres.equalsIgnoreCase("SI")) {
				System.out.println("Puedes acceder si tienes permiso de tus padres");
			}
			else {
				if(edad <16) {
					System.out.println("No puedes acceder, lo siento");
				}
			}
		}

	}

}
