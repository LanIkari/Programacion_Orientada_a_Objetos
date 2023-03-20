package fes.aragon.clases;
import  fes.aragon.clases.punto;

public class linea {
	private punto pInicial;
	private punto pFinal;
	
	public linea() {
		super();
		this.pInicial = new punto();
		this.pFinal = new punto ();
	}

	public linea(punto pInicial, punto pFinal) {
		super();
		this.pInicial = pInicial;
		this.pFinal = pFinal;
	}

	public punto getpInicial() {
		return pInicial;
	}

	public void setpInicial(punto pInicial) {
		this.pInicial = pInicial;
	}

	public punto getpFinal() {
		return pFinal;
	}

	public void setpFinal(punto pFinal) {
		this.pFinal = pFinal;
	}

	@Override
	public String toString() {
		return pInicial + " - " + pFinal;
	}

}
