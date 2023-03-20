package fes.aragon.Inicio;

import fes.aragon.Clases.Racional;
import fes.aragon.Clases.operacionesConRacionales;

public class Racionales {
	public static void main(String[] args) {
		Racional racionalUno = new Racional();
		Racional racionalDos = new Racional(2,4);
		operacionesConRacionales racionalTres = new operacionesConRacionales (racionalUno,racionalDos);
		System.out.println(racionalUno.toString());
		
		System.out.println(racionalDos.toString());
		System.out.println("La suma es:");
		System.out.println(racionalTres.suma());
		
		System.out.println("La resta es:");
		System.out.println(racionalTres.resta());
		
		System.out.println("La multiplicacion es:");
		System.out.println(racionalTres.multiplicacion());
		
		System.out.println("La divicion es:");
		System.out.println(racionalTres.divicion());
		
		//CODIGO DE MIGUEL
		System.out.println("Cambio los atributos de mi objeto en operacionesConRaciones");
		Racional r1 = new Racional(10,0);
		Racional r2 = new Racional(1,5);
		System.out.println(racionalTres.suma(r1, r2));
		
		
		
	}

}
