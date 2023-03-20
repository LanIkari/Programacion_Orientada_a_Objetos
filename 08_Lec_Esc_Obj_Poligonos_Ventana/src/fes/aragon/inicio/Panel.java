package fes.aragon.inicio;

import java.awt.Graphics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import fes.aragon.clases.linea;
import fes.aragon.clases.punto;

public class Panel extends JPanel {
	private ArrayList<linea> pol = new ArrayList<linea>();
	private String nombre = "Cuadrado.txt";

	public Panel() {
		this.abrirArchivo();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (linea puntos : pol) {
			g.drawLine(puntos.getpInicial().getX1(), puntos.getpInicial().getFx(), puntos.getpFinal().getX1(),
					puntos.getpFinal().getFx());
		}
	}

	public void abrirArchivo() {
		pol.clear();
		File f = new File("C:\\Users\\angel\\OneDrive\\Documentos\\" + this.nombre);
		if (f.exists()) {
			try {
				FileReader fr = new FileReader(f);
				BufferedReader buf = new BufferedReader(fr);
				String linea = " ";
				while ((linea = buf.readLine()) != null) {
					String[] arg = linea.split(",");
					int x1 = Integer.parseInt(arg[0]);
					int y1 = Integer.parseInt(arg[1]);
					int x2 = Integer.parseInt(arg[2]);
					int y2 = Integer.parseInt(arg[3]);
					pol.add(new linea(new punto(x1, y1), new punto(x2, y2)));

				}
				for (int i = 0; i < pol.size(); i++) {
					System.out.println(pol.get(i).toString());
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("no esta");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
