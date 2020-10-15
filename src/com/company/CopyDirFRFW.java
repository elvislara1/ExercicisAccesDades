package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class CopyDirFRFW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rutaInicio = scanner.next();
        String rutaDestino = scanner.next();

        FileReader inicio = new FileReader(rutaInicio);
        FileWriter destino = new FileWriter(rutaDestino);

        for (int i = 0; i < inicio.read(); i++) {
            inicio.read();
            System.out.println(destino);
        }
    }
}