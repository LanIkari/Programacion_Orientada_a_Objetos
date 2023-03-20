package fes.aragon.modelo;

public class OperacionesRacionales {
	private Racional racionalUno;
	private Racional racionalDos;
	private Racional racionalTres;

	public OperacionesRacionales() {
		// TODO Auto-generated constructor stub
		this.racionalUno = new Racional();
		this.racionalDos = new Racional();
	}

	public OperacionesRacionales(Racional racionalUno, Racional racionalDos) {
		super();
		this.racionalUno = racionalUno;
		this.racionalDos = racionalDos;
	}
	
	public Racional suma() {
		Racional racionalTres = new Racional();
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
	
	public Racional suma(Racional racionalUno, Racional racionalDos) {
		this.racionalUno = racionalUno;
		this.racionalDos = racionalDos;
		
		return this.suma();
	}
	
	public Racional resta() {
		Racional racionalTres = new Racional();
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
	
	public Racional resta(Racional racionalUno, Racional racionalDos) {
		this.racionalUno = racionalUno;
		this.racionalDos = racionalDos;
		
		return this.resta();
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
	
	public Racional multiplicacion(Racional racionalUno, Racional racionalDos) {
		this.racionalUno = racionalUno;
		this.racionalDos = racionalDos;
		
		return this.multiplicacion();
	}
	
	public Racional division() {
		Racional racionalTres = new Racional();
		racionalTres.setDenominador(
									this.racionalUno.getDenominador()*
									this.racionalDos.getNumerador());
		racionalTres.setNumerador(
									this.racionalUno.getNumerador()*
									this.racionalDos.getDenominador());
		return racionalTres;
	}
	
	public Racional division(Racional racionalUno, Racional racionalDos) {
		this.racionalUno = racionalUno;
		this.racionalDos = racionalDos;
		
		return this.division();
	}

	public Racional getRacionalUno() {
		return racionalUno;
	}

	public Racional getRacionalDos() {
		return racionalDos;
	}

	public Racional getRacionalTres() {
		return racionalTres;
	}

	public void setRacionalUno(Racional racionalUno) {
		this.racionalUno = racionalUno;
	}

	public void setRacionalDos(Racional racionalDos) {
		this.racionalDos = racionalDos;
	}

	public void setRacionalTres(Racional racionalTres) {
		this.racionalTres = racionalTres;
	}
	
	
	
}