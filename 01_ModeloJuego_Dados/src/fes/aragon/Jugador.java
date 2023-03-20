package fes.aragon;

import fes.aragon.dado.Dado;

public class Jugador {
	
	private String nombre;
	private Dado dadoUno = null;
	private Dado dadoDos = null;
	
	public Jugador (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Dado getDadoUno() {
		return dadoUno;
	}
	
	public Dado getDadoDos() {
		return dadoDos;
	}

	public void setDadoUno(Dado dadoUno) {
		this.dadoUno = dadoUno;
	}

	public void setDadoDos(Dado dadoDos) {
		this.dadoDos = dadoDos;
	}
	
}
