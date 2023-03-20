package fes.aragon.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import fes.aragon.datos.*;

public class Archivo {
	private ArrayList<Datos> Datos= new ArrayList<>();
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

	public ArrayList<Datos> getDatos() {
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
			Datos dat= new Datos();
			dat.setNombre(arg[0]);
			dat.setNumeroUno(Float.parseFloat(arg[1]));
			dat.setNumeroDos(Integer.parseInt(arg[2]));
			this.Datos.add(dat);
			
		}
		}else {
			//System.out.println("No existe el archivo");
			new IOException("No existe archivo");
		}
	}

	public void almacenar( String ruta, ArrayList<Datos> datos) {
		File file= new File(ruta);
		try {
			FileWriter fw= new  FileWriter(file);
			PrintWriter pw= new PrintWriter(fw);
			for (Datos info : datos) {
				pw.print(info.getNombre()+";");
				pw.print(info.getNumeroUno()+";");
				pw.println(info.getNumeroDos());
			}
			pw.close();
			fw.close();
		} catch( IOException e) {
			e.printStackTrace();
		}
	}

}