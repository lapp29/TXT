package edu.cuc.talleres;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ContadorLineas {
    /*
    Diseñe un programa que tome un archivo de texto e 
    indique el número de líneas que lo forman. 
    */
    private File archivoObjetivo;
    
    //Constructor
    public ContadorLineas(File archivoObjetivo) {
        this.archivoObjetivo = archivoObjetivo;
    }
    
    //Método Contar Lineas
    public int contarLineas() throws FileNotFoundException {
        //Se define una instancia Scanner para acceder al archivo
        Scanner scanner = new Scanner(archivoObjetivo);
        
        //Se define el contador (resultado) del proceso
        int contadorLineas = 0;
        
        //Se lee todo el archivo línea por línea, mientras existan líneas disponibles
        while (scanner.hasNextLine()) {            
            scanner.nextLine(); //Se hace la lectura, no se hace nada con la línea.
            contadorLineas++; //Se cuenta la línea leída.
        }
        
        scanner.close(); //Se cierra el scanner.
        return contadorLineas; 
    }
    
     public int contarPalabras() throws FileNotFoundException {
        //Se define una instancia Scanner para acceder al archivo
        Scanner scanner = new Scanner(archivoObjetivo);
        
        //Se define el contador (resultado) del proceso
        int contadorPalabras = 0;
        
        //Se lee todo el archivo línea por línea, mientras existan líneas disponibles
        while (scanner.hasNext()) {            
            scanner.next(); //Se hace la lectura, no se hace nada con la línea.
            contadorPalabras++; //Se cuenta la línea leída.
        }
        
        scanner.close(); //Se cierra el scanner.
        return contadorPalabras; 
    }
}
