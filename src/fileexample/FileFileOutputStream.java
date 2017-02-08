/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dani
 */
public class FileFileOutputStream {

    FileOutputStream fileOut = null;
    String cadenaTxt = "";
    
    public void fOutputDocument(File f){
        
        try {
            System.out.println("Vamos a grabar algo en el fichero usando OutputStream");
            fileOut = new FileOutputStream(f);
            cadenaTxt = "Anakin se entrego al lado oscuro de la fuerza";
            byte[] txtBytes = cadenaTxt.getBytes();
            fileOut.write(txtBytes);
            
            fileOut.close();
            
        } catch (Exception ex) {
            System.out.println("No he podido guardar el contenido en el documento");
        }
        
    }
    
}
