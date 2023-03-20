package fes.aragon.dado;

import java.util.Random;

public class Dado {

	private int cara;
	
	public Dado() {
	}

	public int getCara() {
		return cara;
	}
	
	public void lanzar() {
		Random rd = new Random();
		this.cara = rd.nextInt(6);	}
}
