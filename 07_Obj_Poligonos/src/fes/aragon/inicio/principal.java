package fes.aragon.inicio;

import fes.aragon.clases.punto;
import fes.aragon.clases.linea;

import fes.aragon.clases.*;
public class principal {
	public static void main(String[] args) {
		linea[] pol= new linea[5];
		pol[0]=new linea(new punto(10,20), new punto(20,30));
		pol[1]=new linea(new punto(20,30), new punto(30,40));
		pol[2]=new linea(new punto(30,40), new punto(40,50));
		pol[3]=new linea(new punto(50,20), new punto(50,60));
		pol[4]=new linea(new punto(10,20), new punto(60,70));
		for (int i = 0; i < pol.length; i++) {
			System.out.println(pol[i]);
		}
		punto puntoUno = new punto(10,13);
		punto puntoDos = new punto();
		System.out.println("El punto uno esta en:"+puntoUno);
		System.out.println("Origen:"+puntoDos);
		puntoUno.moverPunto(3, 2);
		System.out.println("Punto uno mas (3,2):"+ puntoUno);
		puntoUno.moverPunto(-8, -10);
		System.out.println(puntoUno);
		
		
	}
}
