package fes.aragon;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import fes.aragon.dado.Dado;

public class Juego {
	
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	Dado dadoUno = new Dado();
	Dado dadoDos = new Dado();
	
	public Juego() {
		this.jugadores = new ArrayList<>();
	}

	
	private ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public static void main(String[] args) {
		/*Dado dadoUno = new Dado();
		Dado dadoDos = new Dado();
		Jugador jugador = new Jugador("Brus");
		jugador.setDadoUno(dadoUno);
		jugador.setDadoDos(dadoDos);
		
		jugador.getDadoUno().lanzar();
		jugador.getDadoDos().lanzar();
		int var1 = jugador.getDadoUno().getCara();
		int var2 = jugador.getDadoDos().getCara(); 
		int suma = var1 + var2;*/
		
		Juego juego = new Juego();
		
		for(int i = 0; i<10; i++) {
			Dado dadoUno = new Dado();
			Dado dadoDos = new Dado();
			Jugador jugador = new Jugador("J"+i);
			jugador.setDadoUno(dadoUno);
			jugador.setDadoDos(dadoDos);
			juego.getJugadores().add(jugador);
		}
		
		for(Jugador ob : juego.getJugadores()) {
			ob.getDadoUno().lanzar();
			ob.getDadoDos().lanzar();
			
			int v1 = ob.getDadoUno().getCara();
			int v2 = ob.getDadoDos().getCara();
			
			int suma = v1 + v2;
			
			if(suma ==7) {
				System.out.println(ob.getNombre()+": Gana");
			} else {
				System.out.println(ob.getNombre()+": Pierde");
			}
		}
	}
}

// La libreria el partenon quiere llevar un res¿gistro de su almacen de los libros que tiene.
// Diseña una aplicacion de escritorio que permita llevar este control empezando desde el diseño uml hasta
// el diseño de la interfaz grafica(view)







