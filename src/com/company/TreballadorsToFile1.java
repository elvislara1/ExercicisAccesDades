package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TreballadorsToFile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.next();

        boolean seguir = true;

        try {
            File archivo = new File(nombre);
            PrintWriter informacion = new PrintWriter(archivo);

            while (seguir == true){
                System.out.println("Introduce tu nombre: ");
                String nom = scanner.next();
                System.out.println("Introduce tu apellido: ");
                String cognom = scanner.next();
                System.out.println("Introduce tu salario: ");
                int salari = scanner.nextInt();
                System.out.println("Estas casado? Y / N");
                String casado = scanner.next();
                System.out.println("Vols continuar? Y / N");
                String quieresSeguir = scanner.next();
                if (!quieresSeguir.equals("Y")){
                    seguir = false;
                    informacion.print(nom + "," + cognom + "," +  salari + "," + casado);
                }else{
                    seguir = true;
                    System.out.println(" ");
                    informacion.println(nom + "," + cognom + "," +  salari + "," + casado);
                }
            }informacion.close();


        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
