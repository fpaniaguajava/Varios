package com.fernandopaniagua.ejemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploArrayList {
	public static void main(String[] args) {
		List<String> nombrePlayers = new ArrayList<String>();
		nombrePlayers.add(new String("Ronaldo"));
		nombrePlayers.add(new String("Asensio"));
		nombrePlayers.add(new String("Zico"));
		nombrePlayers.add(new String("Diego"));
		
		Collections.sort(nombrePlayers);
		
		
		List<Jugador> players = new ArrayList<Jugador>();
		players.add(new Jugador("Ronaldo",10000));
		players.add(new Jugador("Asensio",50000));
		players.add(new Jugador("Zico",3000));
		players.add(new Jugador("Diego",80000));
		
		Collections.sort(players);
		
		
		Jugador diego = new Jugador("Diego",3000);
		Jugador miguel = new Jugador("Miguel",3000);
		
		boolean sonIguales = diego.equals(miguel);
		
		
		System.out.println("Fin");
	}
	
}

class Jugador implements Comparable<Jugador>{
	private String nombre;
	private int salario;
	public Jugador(String nombre, int salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public int compareTo(Jugador o) {
		return (this.salario-o.salario)*-1;
	}
	@Override
	public boolean equals(Object obj) {
		return this.salario==((Jugador)obj).salario;
	}
	
}
