package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharsToFile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.next();

        try {
            File archivo = new File(nombre);
            PrintWriter alphabet = new PrintWriter(archivo);

            for(char c = 'a'; c <= 'z'; c++){
                alphabet.println(c);
            }
            alphabet.close();

        } catch(Exception e) {
            System.out.println("Error de escritura del fichero");
            System.out.println(e.getMessage());
        }
    }
}
