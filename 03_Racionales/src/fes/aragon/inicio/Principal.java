package fes.aragon.inicio;

import fes.aragon.clases.Racional;
import fes.aragon.clases.OperacionesRacionales;

public class Principal {
	public static void main(String[] args) {
		Racional racionalUno = new Racional(8,9);
		Racional racionalDos = new Racional(3,5);
		
		System.out.println(racionalUno.toString());
		System.out.println(racionalDos.toString());
		System.out.println("suma:"+racionalUno.toString()+"+"+racionalDos.toString() );
		
		OperacionesRacionales op= new OperacionesRacionales(racionalUno,racionalDos);
		Racional resultado = op.suma();
		System.out.println(resultado.toString());
		
	}
}
