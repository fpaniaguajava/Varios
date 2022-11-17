package com.fernandopaniagua.ejemplo;

import java.util.Arrays;
import java.util.List;

public class EjemploArrays {

	public static void main(String[] args) {
		int[] edades = {3,8,1,50,31,12};
		//Conversión a lista de una array
		List listaEdades = Arrays.asList(edades);
		//Rellenar un array
		int[] posiciones = new int[100];
		Arrays.fill(posiciones, -1);
		//Ordenar array
		Arrays.sort(edades);
		//Búsqueda binaria
		int posicion = Arrays.binarySearch(edades, 12);
		//Arrays de dos dimensiones (matrices)
		int[][] tablero1 = new int[10][5];
		tablero1[0][0]=10;
		int tablero2[][];
		int[] tablero3[];
		
		
		
		
		
		System.out.println("FIN");
	}

}
