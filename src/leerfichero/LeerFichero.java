/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerfichero;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio
 */
public class LeerFichero {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws IOException {
       	try(FileReader ruta=new FileReader("/home/sergio/archivo.txt");
			FileWriter fw=new FileWriter("/home/sergio/archivo.txt")){
			escribeFichero(fw);
			//Guardamos los cambios del fichero
			fw.flush();
			leeFichero(ruta);
		}catch(IOException e){
			System.out.println("Error E/S: "+e);
		}
	}

	public static void escribeFichero(FileWriter fw) throws IOException{
		
		fw.write("escribirrrrrrr en texto");
	}

	public static void leeFichero(FileReader ruta) throws IOException{
		int valor=ruta.read();
		while(valor!=-1){
			System.out.print((char)valor);
                        
			valor=ruta.read();
		}
	}
}