package fes.aragon.Clases;

import fes.aragon.Clases.Racional;

public class operacionesConRacionales {
	private Racional racionalUno;
	private Racional racionalDos;
	private Racional racionalTres;
	
	
	public operacionesConRacionales() {
		this.racionalUno= new Racional();
		this.racionalDos= new Racional();
	}
	
	public operacionesConRacionales(Racional racionalUno, Racional racionalDos) {
		super();
		this.racionalUno = racionalUno;
		this.racionalDos = racionalDos;
	}
	
	
	public Racional suma(Racional racionalUno,
			Racional racionalDos) {
		this.racionalUno= racionalUno;
		this.racionalDos= racionalDos;
		return this.suma();
		//Buena practica de programacion
	}
	//Con este metodo cambiamos los atributos de mi objeto, y mi programa truena
	public Racional suma() {
		Racional racionalTres = new Racional();
		racionalTres.setNumerador((this.racionalUno.getNumerador()*
								this.racionalDos.getDenominador())+
								(this.racionalUno.getDenominador()*
								this.racionalDos.getNumerador()));
		racionalTres.setDenominador(this.racionalUno.getDenominador()*this.racionalDos.getDenominador());
		return racionalTres;
	}
	
	public Racional resta(Racional racionalUno, Racional racionalDos) {
		this.racionalUno = racionalUno;
		this.racionalDos =racionalDos;
		return this.resta();
	}
	
	public  Racional resta() {
		Racional racionalTres = new Racional();
		racionalTres.setNumerador((this.racionalUno.getNumerador()*
								this.racionalDos.getDenominador())-
								(this.racionalUno.getDenominador()*
								this.racionalDos.getNumerador()));
		racionalTres.setDenominador(this.racionalUno.getDenominador()*this.racionalDos.getDenominador());
		return racionalTres;
	}
	
	public Racional multiplicacion(Racional racionalUno, Racional racionalDOS) {
		this.racionalUno = racionalUno;
		this.racionalDos = racionalDos;
		return this.multiplicacion();
	}
	
	public Racional multiplicacion() {
		Racional racionalTres = new Racional();
		racionalTres.setNumerador(this.racionalUno.getNumerador()*
								this.racionalDos.getNumerador());
		racionalTres.setDenominador(this.racionalUno.getDenominador()*
								this.racionalDos.getDenominador());
		return racionalTres;
	}
	
	public Racional divicion(Racional racionalUno, Racional RacionalDos) {
		this.racionalUno = racionalUno;
		this.racionalDos = racionalDos;
		return this.divicion();
	}
	
	public Racional divicion() {
		Racional racionalTres = new Racional();
		racionalTres.setNumerador(this.racionalUno.getNumerador()*
								this.racionalDos.getDenominador());
		racionalTres.setDenominador(this.racionalDos.getNumerador()*
									this.racionalUno.getDenominador());
		return racionalTres;
	}

}
