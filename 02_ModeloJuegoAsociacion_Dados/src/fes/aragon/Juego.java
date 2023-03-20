package fes.aragon;

public class Juego {

	public static void main(String[] args) {
		Jugador jugador = new Jugador("Brus");
		jugador.getDadoUno().lanzar();
		jugador.getDadoDos().lanzar();
		int var1 = jugador.getDadoUno().getCara();
		int var2 = jugador.getDadoDos().getCara();
		int suma = var1 + var2;
		
		if(suma ==7) {
			System.out.println("Gana");
		} else {
			System.out.println("Pierde");
		}
	}
}
