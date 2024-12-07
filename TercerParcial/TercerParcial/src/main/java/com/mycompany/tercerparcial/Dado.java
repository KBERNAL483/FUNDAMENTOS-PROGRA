
package com.mycompany.tercerparcial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kaleb
 */
public class Dado {
    
    static Random generador = new Random();
    
    public static void main(String[] args) {
        boolean salir = false;
        Scanner scan = new Scanner(System.in);
                
        do{
            int res = Dado.tirar();
            
            System.out.println("El dado muestra: " + res);
            
            System.out.print("Repetir? s/N");
            String s = scan.next();
            
            if(s.equals("N")){
                salir = true;
            }
            
        }while(!salir);
    }

    public Dado() {
        generador = new Random();
    }
    
    
    public static int tirar(){
        return generador.nextInt(5) + 1;
    }
    
}