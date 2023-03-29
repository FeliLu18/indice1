package com.rdl;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = new Scanner(System.in);{
			
			System.out.println("Ingrese su nombre");
			String nombre = lectura.next();
			
			System.out.println("Ingrese su apellido");
			String apellido = lectura.next();
            
			System.out.println("Ingrese su edad");
			int edad = lectura.nextInt();
			

	}
		String nombre = "Felicitas";
		String apellido = "Ayala";
		int edad = 25;
		
		System.out.println("Mi nombre es: " + nombre + " Mi apellido es:" + apellido + " y tengo:" + edad + "años");

		if(edad<18) {
			System.out.println("La persona es menor de edad");
		}else {
			System.out.println("La persona es mayor de edad");}
		}
		}

