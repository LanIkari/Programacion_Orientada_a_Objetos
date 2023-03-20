package fes.aragon.Inicio;
import fes.aragon.Clases.persona;

public class person {
	
	public static void main(String[]arg) {
		persona alumno = new persona("Brandon","Avendaño Villegas","POO", 9, 316353087);
		alumno.informacion("Brandon","Avendaño Villegas" , 316353087,"POO");
		alumno.aprovacion(9);
		alumno.toString();
		
	}
}