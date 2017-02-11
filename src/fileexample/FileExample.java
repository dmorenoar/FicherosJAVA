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
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author dani
 */
public class FileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        final Formatter fort;
        
        FileReaderExample fReader = new FileReaderExample();
        FileWriterExample fWriter = new FileWriterExample();
        FileFileOutputStream fOutput = new FileFileOutputStream();
        FileFileInputStream fInput = new FileFileInputStream();
        FileRandomAccessFile fRandom = new FileRandomAccessFile();
        
        String document = "StarWars.txt";
        String path ="C:\\Users\\dani\\Documents\\NetBeansProjects\\FileExample\\" ; 
        File f = new File( path + document);    
        
        if(f.exists()){
            System.out.println("El documento " + f.getName() + " existe");
        }else{
            try{    
                System.out.println("El fichero no existe, pero se crea");
                System.out.println("Vamos a poner a prueba  GITHUB");
                fort = new Formatter(f);    
            }catch(Exception ex){
                System.out.println("No se ha podido crear el fichero");
            } 
        }
        
        //fWriter.deleteDocument(f);
        //fWriter.writerDocument(f);
        //fReader.readerDocument(f);  
        //fOutput.fOutputDocument(f);
        //fInput.fInputDocument(f);
        fRandom.randomAccessWrite(f);
        fRandom.randomAccessRead(f);
        
        
  }
    
}
