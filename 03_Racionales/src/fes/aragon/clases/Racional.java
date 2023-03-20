package fes.aragon.clases;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional() {
		this.numerador=1;
		this.denominador=1;
	}
	public Racional(int numerador, int denominador) {
		super();//para llamar los constructores de objeto objet
		this.numerador = numerador;
		this.setDenominador(denominador) ;
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
	public void setDenominador(int denominador) {
		if (denominador!=0) {
			this.denominador=denominador;
		}else {
			this.denominador=1;
		}
		this.denominador = denominador;
		
	}
	@Override
	public String toString() {
		return this.numerador+"/"+this.denominador;
	}
}

