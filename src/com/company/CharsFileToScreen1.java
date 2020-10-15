package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharsFileToScreen1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.next();

        try {
            File archivo = new File(nombre);
            Scanner read = new Scanner(archivo);
            while (read.hasNextLine()) {
                String contenido = read.nextLine();
                System.out.print(contenido.toUpperCase() + " " );
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
