package fes.aragon.datos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TablaArchivoImpl extends AbstractTableModel {
	private ArrayList<Datos> datos;
	private String [] nombres = {"Nombre","Dato 1", "Dato 2"};
	
	public TablaArchivoImpl(String ruta) throws IOException {
	Archivo arch = new Archivo (ruta);
	arch.llenarDatos();
	this.datos = arch.getDatos();
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.datos.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.nombres.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Datos tmp = this.datos.get(rowIndex);
		String celda="";
		if (columnIndex==0) {
			celda=tmp.getNombre();
		}else if(columnIndex==1) {
			celda= String.valueOf(tmp.getNumeroUno());
		}else if (columnIndex==2) {
			celda= String.valueOf(tmp.getNumeroDos());
		}
		return celda;
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return super.getColumnName(column);
	}

	public ArrayList<Datos> getDatos() {
		return datos;
	}

	@Override
	public void fireTableDataChanged() {
		// TODO Auto-generated method stub
		super.fireTableDataChanged();
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return true;
	}
// hacemos la trasfomacion a String a "aValue" porque es un objeto
	@Override
	public void setValueAt(Object aValue, int row, int column) {
		// TODO Auto-generated method stub
		Datos inf= datos.get(row);
		if (column==0) {
			inf.setNombre((String)aValue);
		}else if(column==1) {
			inf.setNumeroUno(Float.parseFloat((String)aValue));
		}else if(column==2){
			inf.setNumeroDos(Integer.parseInt((String)aValue));
		}
	}
	
	public void borrarFila(int row) {
		this.datos.remove(row);
	}
	
	public void  almacenar(String ruta) {
		Archivo  arch = new Archivo();
		arch.almacenar(ruta, datos);
	}
	
}
