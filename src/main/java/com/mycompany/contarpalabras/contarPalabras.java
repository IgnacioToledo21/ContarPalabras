package com.mycompany.contarpalabras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class contarPalabras {
    
    public static void main(String[] args) {
        
        int contador = 0;
        
        //Archivo a leer
        File Lectura = new File("Lectura.txt");
        
        try {
            
            if (Lectura.exists()) {
                //Leer archivos 
                BufferedReader br = new BufferedReader(new FileReader("Lectura.txt"));
                System.out.println("Texto leído.\n");
                
                //Conteo de palabras
                
                String linea = br.readLine();
                while (linea != null){
                    System.out.println(linea);
                    //Donde haya espacios en blanco dividimos
                    String[] palabras = linea.split(" ");
                    //Acumular palabras
                    contador += palabras.length;
                    //Leemos siguiente linea
                    linea = br.readLine();
                }
                
                br.close();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: Archivo no encontrado.");
        }
        
        System.out.print("Palabras contados: " + contador);
    }
    
}
