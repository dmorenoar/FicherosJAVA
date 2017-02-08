/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;

/**
 *
 * @author dani
 */
public class FileReaderExample {

    public void readerDocument(File f) throws FileNotFoundException{
        FileReader reader = new FileReader(f);
        BufferedReader buffer = new BufferedReader(reader);
        String bfReader = "" ;
        String txtDocument = "" ;
        
        try {        
            System.out.println("Vamos a leer del documento con FileReader");
            //Leemos y verificamos que nos devuelve algo, y si no lo hace nos da null.
            while((bfReader = buffer.readLine()) != null){
               //Almacenamos en una variable String lo que vamos leyendo.
                txtDocument = txtDocument + bfReader;
            }
            reader.close();
            System.out.println(txtDocument);
        } catch (Exception e) {
            System.out.println("No se ha podido leer el documento");
        }
    }
    
}
