package fes.aragon;

import fes.aragon.dado.Dado;

public class Jugador {
	
	private String nombre;
	private Dado dadoUno = new Dado();
	private Dado dadoDos = new Dado();
	
	public Jugador (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	Dado getDadoUno() {
		return dadoUno;
	}
	Dado getDadoDos() {
		return dadoDos;
	}
	
	
}
