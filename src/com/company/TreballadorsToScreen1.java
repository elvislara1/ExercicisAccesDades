package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TreballadorsToScreen1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.next();

        try {
            File archivo = new File(nombre);
            Scanner read = new Scanner(archivo);
            while (read.hasNextLine()) {

                for (int i = 1; read.hasNext(); i++) {
                    System.out.println("Treballador " + i);
                    System.out.println(" ");
                    String[] inputs = read.nextLine().split(",");
                    for (int j = 0; j < inputs.length; j++) {
                        System.out.println(inputs[j]);
                    }
                    System.out.println(" ");
                }
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
