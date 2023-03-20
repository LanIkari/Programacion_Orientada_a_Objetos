package fes.aragon.Clases;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional() {
		this.denominador=1;
		this.numerador=1;
	}
	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.setDenominador(denominador);
	}
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	//Antes de pasar el valor del denominador a mi objeto, verifico que no sea igual a 0, pues
	//se indeterminaria.
	public void setDenominador(int denominador) {
		if (denominador != 0) {
			this.denominador = denominador;
		}else {
			this.denominador =1;
		}
	}
	public String toString() {
		return this.numerador+"/"+this.denominador;
		
	}
	
	
	
	
}
