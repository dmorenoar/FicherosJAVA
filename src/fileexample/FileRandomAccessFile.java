/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author dani
 */
public class FileRandomAccessFile {
    
    public void randomAccessWrite(File f) throws IOException{
        RandomAccessFile random = new RandomAccessFile(f,"rw");
        random.writeBytes("La fuerza es poderosa en ti...");
        //random.writeChars("La fuerza es poderosa en ti...");
        random.close();     
    }
    
    public void randomAccessRead(File f) throws IOException{
        
        RandomAccessFile random = new RandomAccessFile(f,"rw");
        //Movemos el puntero a la posición que queremos del fichero
        random.seek(5);
        //Leemos a partir de esa posición
        System.out.println(random.readLine());
        
        //random.readByte();
        //random.seek(0);
        //System.out.println(random.readLine());
        random.close();     
    }
    
}
