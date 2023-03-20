/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Escritura {

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File f = new File(System.getProperty("user.dir") + "/tmp");
            fw = new FileWriter(f,true);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < 10; i++) {
                pw.println(i);
            }
            pw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
