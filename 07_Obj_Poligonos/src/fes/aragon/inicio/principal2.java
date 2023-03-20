package fes.aragon.inicio;

 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import fes.aragon.clases.punto;
import fes.aragon.clases.linea;


public class principal2 {
	public static void main(String[] args) {
		ArrayList<linea> pol = new ArrayList<>(); 
		File f = new File ("C:\\Users\\angel\\OneDrive\\Documentos\\archivo.txt");
		if (f.exists()) {
			try {
				FileReader fr = new FileReader(f);
				BufferedReader buf = new BufferedReader(fr);
				String linea ="";
				while ((linea = buf.readLine())!=null) {
					String[] arg = linea.split(",");
					int x1 = Integer.parseInt(arg[0]);
					int y1 = Integer.parseInt(arg[1]);
					int x2 = Integer.parseInt(arg[2]);
					int y2 = Integer.parseInt(arg[3]);
					pol.add(new linea(new punto(x1, y1), new punto(x2, y2)));
					//System.out.println(x1+","+y1);
					//String[] arg1 = linea.split("-");
					//int x2 = Integer.parseInt(arg1[0]);
					//int y2 = Integer.parseInt(arg1[1]);
					//System.out.println(x2+","+y2);
					
					//punto p1 = new punto(x1, y1);
					//System.out.println(p1);
					
						//linea L1 = new linea(new punto(x1, y1), new punto (x2,y2));
						//System.out.println(1);
					
					//System.out.println(x1 +","+y2);
					//for (int i = 0; i < arg.length; i++) {
						//linea[] pol= new linea[i];
						//linea = new linea(new punto(x1, y2), new punto(x1, y2));
						//System.out.println(pol[i]);
						//linea.
					//}
					//linea L1 = new linea(new punto(arg[0], arg[1]), new punto(arg[0], arg[1]))				
					//String y = arg [1];
					//int y1 = Integer.parseInt(arg[1]);
					//System.out.println(y1);
					//String x2 = arg1 [1];
					//int x4 = Integer.parseInt(arg1 [0]);
					//System.out.println(x4);
					
					
					
					//int  y = Integer.parseInt(arg[1]);
					//String p1 = arg1 (new punto(arg[0], arg[1]));
					// System.out.println(x);
					//String x = Integer.parseInt(arg[0]);
					//System.out.println(x);
					//String x = arg [0];
					//String y = arg [1];
					//System.out.println(arg [1]);	
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
			
			
		}else {
			System.out.println("no esta");
		}
		
	}

}
