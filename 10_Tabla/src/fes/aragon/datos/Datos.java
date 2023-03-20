package fes.aragon.datos;

import java.awt.Container;

public class Datos {
	private String nombre;
	private float numeroUno;
	private int numeroDos;
	
	public Datos() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public float getNumeroUno() {
		return numeroUno;
	}
	
	public void setNumeroUno(float numeroUno) {
		this.numeroUno = numeroUno;
	}
	
	public int getNumeroDos() {
		return numeroDos;
	}
	
	public void setNumeroDos(int numeroDos) {
		this.numeroDos = numeroDos;
	}
	@Override
	
	public String toString() {
		return "Datos [nombre=" + nombre + "; numeroUno=" + numeroUno + ";"
				+ "; numeroDos=" + numeroDos + "]";
	}
}
