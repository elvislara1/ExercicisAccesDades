package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumsToFile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.next();

        try {
            File archivo = new File(nombre);
            PrintWriter escribir = new PrintWriter(archivo);

            for (int i = 1100; i < 1201; i++) {
                escribir.println(i);
            }

            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
