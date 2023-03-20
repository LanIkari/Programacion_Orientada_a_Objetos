package fes.aragon.clases;
import fes.aragon.clases.Racional;

public class OperacionesRacionales {
	private Racional racionalUno;//acabamos de declarar dos atributos de clase
	private Racional racionalDos;// el estado inicial del objeto es nulo
	
	public OperacionesRacionales() {
		// TODO Auto-generated constructor stub
		
		this.racionalUno= new Racional();//el constructor Racional les da el estado del objeto (1,1)
		this.racionalDos=new Racional();
		
	}
	
	public OperacionesRacionales(Racional racionalUno, Racional racionalDos) {
		super();
		this.racionalUno = racionalUno;
		this.racionalDos = racionalDos;
	}
	
	public Racional suma() {
		Racional racionalTres= new Racional();
		racionalTres.setDenominador(
				this.racionalUno.getDenominador()*
				this.racionalDos.getDenominador());
		racionalTres.setNumerador(
				(this.racionalUno.getNumerador()*
				this.racionalDos.getDenominador())+
				(this.racionalUno.getDenominador()*
				this.racionalDos.getNumerador()));
		return racionalTres;
	}
	
	public Racional resta() {
		Racional racionalTres= new Racional();
		racionalTres.setDenominador(
				this.racionalUno.getDenominador()*
				this.racionalDos.getDenominador());
		racionalTres.setNumerador(
				(this.racionalUno.getNumerador()*
				this.racionalDos.getDenominador())-
				(this.racionalUno.getDenominador()*
				this.racionalDos.getNumerador()));
		return racionalTres;
	}
	
	public Racional multiplicacion() {
		Racional racionalTres = new Racional();
		racionalTres.setDenominador(
				this.racionalUno.getDenominador()*
				this.racionalDos.getDenominador());
		racionalTres.setNumerador(
				this.racionalUno.getNumerador()*
				this.racionalDos.getNumerador());
		return racionalTres;
	}
	
	public Racional dividir() {
		Racional racionalTres = new Racional();
		racionalTres.setDenominador(
				this.racionalUno.getDenominador()/
				this.racionalDos.getDenominador());
		racionalTres.setNumerador(
				this.racionalUno.getNumerador()/
				this.racionalDos.getNumerador());
		return racionalTres;
	}
}
