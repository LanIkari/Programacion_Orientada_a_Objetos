package fes.aragon.modelo;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional() {
		// TODO Auto-generated constructor stub
		this.numerador=1;
		this.denominador=1;
	}
	
	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.setDenominador(denominador);
	}
	
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getNumerador() {
		return this.numerador;
	}
	
	
	public void setDenominador(int denominador) {
		if(denominador != 0) {
			this.denominador = denominador;
		}
		else {
			this.denominador = 1;
		}
	}
	public int getDenominador() {
		return this.denominador;
	}

	public String toString() {
		return this.numerador +"/"+ this.denominador;
	}
}