package com.rdl;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String utiles []= {"mochila","lapices","birome","cartuchera"};
		double precios []= {3584.12,1350,230,1852.65};
		      System.out.println("Lista de mercaderias y sus precios");
		              for (int u=0;u<utiles.length;u++){
		            	  System.out.println("Articulo" + utiles[u] + "Precio: $" + precios[u]);
		              }
	}        

}


