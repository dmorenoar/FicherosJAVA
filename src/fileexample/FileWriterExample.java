/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

/**
 *
 * @author dani
 */
public class FileWriterExample {
    
    public void writerDocument(File f) throws IOException{

        
        FileWriter writer = new FileWriter(f,true);
       
        //Usamos FileWriter para escribir en el fichero y refrescamos con flush
        System.out.println("Vamos a escribir en el documento con FileWriter");
        writer.write("Hace mucho tiempo en una galaxia muy, muy lejana...");
        writer.flush();
        writer.close();
    }
    
    public void deleteDocument(File f){
        if(f.delete()){
            System.out.println("Documento eliminado satisfactoriamente");
        }
        
    }  
    
}
