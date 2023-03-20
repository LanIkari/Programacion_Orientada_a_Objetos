package fes.aragon.inicio;

import javax.swing.table.AbstractTableModel;

public class implementaTabla extends AbstractTableModel {
	private String [][] matriz= {{"A1","A2","A3"},{"B1","B2","B3"}}; 
	private String [] nombre = {"C1","C3","C3"};
	
	public implementaTabla(){
		
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return nombre [column];
	}
	//Filas
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return matriz.length;
	}
	//columnas
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return matriz [0].length;
	}
	
	@Override
	public Object getValueAt(int row, int column) {
		String celda = matriz[row][column];
		return celda;
	}
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void setValueAt(Object data, int row, int column) {
		// TODO Auto-generated method stub
		String con= (String) data;
		matriz[row][column]=con;
	}

}