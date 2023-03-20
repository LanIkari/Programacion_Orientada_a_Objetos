package fes.aragon.datos;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TablaArchivoImpl extends AbstractTableModel {
	private ArrayList<DatosPersona> datos;
	private String [] persona = {"Nombre","Apellido Paterno", "Apellido materno", "Sexo", "Telefono", "EstadoCivil", "Direccion"};
	
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
		return this.persona.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		DatosPersona tmp = this.datos.get(rowIndex);
		String celda="";
		if (columnIndex==0) {
			celda=tmp.getNombre();
		}else if(columnIndex==1) {
			celda= String.valueOf(tmp.getApellidoPaterno());
		}else if (columnIndex==2) {
			celda= String.valueOf(tmp.getApellidoPaterno());
		}else if (columnIndex==3) {
			celda= String.valueOf(tmp.getSexo());
		}else if(columnIndex==4){
			celda= String.valueOf(tmp.getTelefono());
		}else if(columnIndex==5){
			celda=String.valueOf(tmp.getCodigoPostal());
		}else if(columnIndex==6) {
			celda= String.valueOf(tmp.getEstadoCivil());
		}else if(columnIndex==7) {
			celda= String.valueOf(tmp.getDireccion());
		}
		return celda;
	}
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return super.getColumnName(column);
	}
	public ArrayList<DatosPersona> getDatos() {
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

	@Override
	public void setValueAt(Object aValue, int row, int column) {
		DatosPersona inf= datos.get(row);
		if (column==0) {
			inf.setNombre((String)aValue);
		}else if(column==1) {
			inf.setApellidoPaterno((String)aValue);
		}else if(column==2){
			inf.setApellidoMaterno((String)aValue);//(Integer.parseInt((String)aValue));
		}else if(column==3) {
			inf.setSexo((String)aValue);
		}else if(column==4){
			inf.setTelefono(Long.parseLong((String)aValue));
		}else if(column==5) {
			inf.setCodigoPostal(Integer.parseInt((String)aValue));
		}else if(column==6) {
			inf.setEstadoCivil((String)aValue);
		}else if (column ==7) {
			inf.setDireccion((String)aValue);
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
