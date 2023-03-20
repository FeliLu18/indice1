package com.rdl;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cursos []= {"Filosofia", "Frances", "Mat.Financiera"};
		int practicas []= {22,18,9};
		     System.out.println("Promedio de cursos");
		     System.out.println ("CURSO NOTA");
		     System.out.println ("----- -----");
		int pp=(practicas[0]+practicas[1]+practicas[2])/3;
		     for (int s=0;s<cursos.length;s++) {
		    	 System.out.println(cursos[s]+""+practicas[s]); } System.out.println("Su Promedio es :" +pp);
		     }

		}

