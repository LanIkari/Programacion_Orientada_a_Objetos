package fes.aragon.modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Datos {
	private PropertyChangeSupport soporte = new PropertyChangeSupport(this);

	private Dato racional=new Dato();
	public Datos(){
		soporte.firePropertyChange("modifica.matrix",null,this.racional);
	}
	public void setMatrix(Racional[][]modifica){
		this.racional.setDatos(modifica);
		//Cuando alguien modifique la matriz
		soporte.firePropertyChange("modifica.matrix",null,this.racional);
	}
	
	public void setVista(boolean vista){
		this.racional.setEditar(vista);
		soporte.firePropertyChange("modifica.boolean",null,this.racional);
	}
	public void calculos(int valor){
		
		
		for (int i = 0; i < racional.getDatos().length; i++) {
			Racional a = racional.getDatos()[i][0];
			Racional b = racional.getDatos()[i][1];
			OperacionesRacionales op = new OperacionesRacionales(a,b);
				if(valor==0){
					racional.getDatos()[i][2]=op.suma();
				}else if(valor==1){
					racional.getDatos()[i][2]=op.resta();
				}else if(valor==2){
					racional.getDatos()[i][2]=op.multiplicacion();
				}else if(valor==3){
					racional.getDatos()[i][2]=op.division();
				}
		}
					

		soporte.firePropertyChange("modifica.matrix",null,this.racional);
	}
	public void agregarOyentes(PropertyChangeListener oyentes){
		soporte.addPropertyChangeListener(oyentes);
	}
	public void llamar() {
		soporte.firePropertyChange("modifica.matrix",null,this.racional);
		
	}

}
