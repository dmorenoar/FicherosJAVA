/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileexample;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author dmorenoar
 */
public class FilenameFilterExample {

    public static void main(String[] args) throws IOException {

        //Definir el separador según el SO
        String separador = File.separator;

        //Ruta de proyecto
        String rutaProyecto = System.getProperty("user.dir");

        //Defino la ruta relativa
        String carpeta = rutaProyecto + separador + "documentos";

        /*Creamos la carpeta y la ruta de la carpeta*/
        File rutaCarpeta = new File(carpeta);

        //Verificamos que la carpeta exista
        if (!rutaCarpeta.exists()) {
            //Creamos la carpeta
            rutaCarpeta.mkdir();
        } else {
            System.out.println("La carpeta ya existe");
        }

        /*Creamos un fichero con extensión .txt"*/
        File f = new File(rutaCarpeta + separador + "datos.txt");
        f.createNewFile();
        
        /*Creamos un fichero con extensión .dat"*/
        File f2 = new File(rutaCarpeta + separador + "datos.dat");
        f2.createNewFile();
        
        
        /*Lista ficheros de la carpeta*/
        String[] directorio = rutaCarpeta.list();

        /*Recorremos el directorio buscando las extensiones que queremos controlar*/
        for (int i = 0; i < directorio.length; i++) {
            if (directorio[i].endsWith(".txt")) {
                System.out.println("Tiene extensión txt");
            }else if(directorio[i].endsWith(".dat")){
                System.out.println("Tiene extensión .dat");
            }
        }
    }

}
