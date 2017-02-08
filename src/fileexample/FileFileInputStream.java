/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author dani
 */
public class FileFileInputStream {
    FileInputStream fileInput = null;
    
    public void fInputDocument(File f){

        try {
          System.out.println("Vamos a leer del fichero usando InputStream");
          fileInput = new FileInputStream(f);
          int cont = 0;
          String txtDocument = "";
          
          while(cont != -1){
             cont = fileInput.read();
             txtDocument = txtDocument + (char)cont;
          }
          System.out.println(txtDocument);
          fileInput.close();
        } catch (Exception e) {
            System.out.println("No he podido leer lo que me pides");
        }
        
    }
    
}
