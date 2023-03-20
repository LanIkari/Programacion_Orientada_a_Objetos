package fes.aragon.modelo;

public class Dato {
	private boolean editar=true;
	private Racional [][]datos= new Racional[5][3];
	private String[]nombres={"RacionalUno","RacionalDos","Resultado"};
	
	Dato(){
		for (int i = 0; i < datos.length; i++) {
			Racional ob1= new Racional(0,1);
			Racional ob2= new Racional(0,1);
			Racional ob3= new Racional(0,1);
			datos[i][0]=ob1;
			datos[i][1]=ob1;
			datos[i][2]=ob1;		
		}
	
	}
	public boolean isEditar() {
		return editar;
	}
	public void setEditar(boolean editar) {
		this.editar = editar;
	}
	public Racional[][] getDatos() {
		return datos;
	}
	public void setDatos(Racional[][] datos) {
		this.datos = datos;
	}
	public String[] getNombres() {
		return nombres;
	}
	public void setNombres(String[] nombres) {
		this.nombres = nombres;
	}
	
	
}
