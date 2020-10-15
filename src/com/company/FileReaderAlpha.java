package com.company;

import java.io.*;
import java.util.Scanner;

public class FileReaderAlpha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.next();

        try {
            FileReader file = new FileReader(nombre);
            BufferedReader br = new BufferedReader(file);

            boolean leer = false;

            while (!leer) {
                String line = br.readLine();

                if(line == null){
                    leer = true;
                } else {
                    System.out.print(line.toUpperCase() + " ");
                }
            }
            br.close();
        } catch (IOException leer) {
            leer.printStackTrace();
        }
    }
}