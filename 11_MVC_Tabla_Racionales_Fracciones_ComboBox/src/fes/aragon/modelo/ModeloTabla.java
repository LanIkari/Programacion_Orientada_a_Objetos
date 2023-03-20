package fes.aragon.modelo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel implements PropertyChangeListener{
	private Dato dato= new Dato();

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return dato.getDatos()[0].length;
			 
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return dato.getDatos().length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return dato.getDatos()[rowIndex][columnIndex];
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return dato.getNombres()[column];
	}
	

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		boolean editar=true;
		if(columnIndex>=2){
			editar=false;
		}
		return editar;
	}
	

	@Override
	public void setValueAt(Object evt, int rowIndex, int columnIndex) {
		
		// TODO Auto-generated method stub
		String info=(String)evt;
		String[] ar = info.split("/");
		for (int i = 0; i < ar.length; i++) {
		int num = Integer.parseInt(ar[0]);
		int den = Integer.parseInt(ar[1]);
		Racional rac = new Racional(num,den);
		dato.getDatos()[rowIndex][columnIndex]=rac;
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub
		//Se hace un solo objeto respecto a Datos
		if(arg0.getPropertyName().equals("modifica.matrix")){
			this.dato=(Dato)arg0.getNewValue();
			this.fireTableDataChanged();
		}
	}
    public void oyenteDato(Datos dato){
    	dato.setMatrix(this.dato.getDatos());
    }

}
