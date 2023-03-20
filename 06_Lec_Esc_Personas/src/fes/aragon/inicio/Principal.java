package fes.aragon.inicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import fes.aragon.clases.Persona;

import fes.aragon.clases.*;
public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Persona> per = new ArrayList<>();
		File f = new File("C:\\Users\\angel\\OneDrive\\Documentos\\Datos.txt");
		
		if(f.exists()) {
			try {
				FileReader fr = new FileReader(f);
				BufferedReader buf = new BufferedReader(fr);
				String linea="";
				
				while((linea = buf.readLine())!=null) {
					//System.out.println(linea);
					
					String[] arg = linea.split(",");
					// Nos podemos ahorrar el crear una variable.
					String nom = (arg[0]);
					//per.getNombre(arg[0]);
					//
					String apelP = (arg[1]);
					String apelM = (arg[2]);
					String eda = (arg[3]);
					String sex = (arg[4]);
					String estCiv = (arg[5]);
					String telef = (arg[6]);
					String celu = (arg[7]);
					String corr = (arg[8]);
					
					per.add(new Persona(nom, apelP, apelM, eda, sex, estCiv, telef, celu, corr));
					
				}
				for (int i = 0; i < per.size(); i++) {
					System.out.println(per.get(i).toString());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
		}else {
			System.out.println("No se encuentra");
		}
		
	}
}
