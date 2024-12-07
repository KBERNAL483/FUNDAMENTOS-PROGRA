
package com.mycompany.tercerparcial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kaleb
 */
public class GeneradorContrasenas {
    
    

    public static String generarContrasena(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                          + "abcdefghijklmnopqrstuvwxyz"
                          + "0123456789"
                          + "*/?%.#-_;,";
        StringBuilder contrasena = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(index));
        }
        return contrasena.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("¡Bienvenido al Generador de Contraseñas!");
        
        while (continuar) {
            System.out.print("\nGenerando contraseña...\n");
            String contrasena = generarContrasena(12); 
            System.out.println("Nueva contraseña es: " + contrasena);

            System.out.print("\n¿Deseas generar otra contraseña? (Presiona Enter para continuar o escribe N para salir): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
                System.out.println("Gracias por usar el generador de contraseñas.");
            }
        }
        
        scanner.close();
    }
}
