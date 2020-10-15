package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharsFileReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.next();

        try {
            FileReader archivo = new FileReader(nombre);

            int line = archivo.read();

            while (line != -1) {
                System.out.print((char) line);
                line = archivo.read();
            }
            archivo.close();
        } catch (IOException leer) {
            leer.printStackTrace();
        }
    }
}