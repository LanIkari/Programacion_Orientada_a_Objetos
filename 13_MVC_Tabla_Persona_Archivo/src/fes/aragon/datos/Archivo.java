package fes.aragon.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Archivo {
	private ArrayList<DatosPersona> Datos= new ArrayList<>();
	private String ruta="";
	
	public Archivo() {
		
	}
	public Archivo(String ruta) {
		super();
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public ArrayList<DatosPersona> getDatos() {
		return Datos;
	}
	public void llenarDatos() throws IOException {
		File file = new File (this.ruta);
		if(file.exists()) {
		FileReader fr = new FileReader(file);
		BufferedReader buf = new BufferedReader(fr);
		String cad = "";
		while ((cad=buf.readLine())!=null) {
			String[] arg= cad.split(";");
			DatosPersona dat= new DatosPersona();
			dat.setNombre(arg[0]);
			dat.setApellidoPaterno(arg[1]);
			dat.setApellidoMaterno(arg[2]);
			dat.setSexo(arg[3]);
			dat.setTelefono(Long.parseLong(arg[4]));
			dat.setCodigoPostal(Integer.parseInt(arg[5]));
			dat.setEstadoCivil(arg[6]);
			dat.setDireccion(arg[7]);
			this.Datos.add(dat);
		}
		}else {
			//System.out.println("No existe el archivo");
			new IOException("No existe archivo");
		}
	}

	public void almacenar( String ruta, ArrayList<DatosPersona> datos) {
		File file= new File(ruta);
		try {
			FileWriter fw= new  FileWriter(file);
			PrintWriter pw= new PrintWriter(fw);
			for (DatosPersona info : datos) {
				pw.print(info.getNombre()+";");
				pw.print(info.getApellidoPaterno()+";");
				pw.print(info.getApellidoMaterno()+";");
				pw.print(info.getSexo()+";");
				pw.print(info.getTelefono()+";");
				pw.print(info.getCodigoPostal()+";");
				pw.print(info.getEstadoCivil()+";");
				pw.println(info.getDireccion());
			}
			pw.close();
			fw.close();
		} catch( IOException e) {
			e.printStackTrace();
		}
	}
}
