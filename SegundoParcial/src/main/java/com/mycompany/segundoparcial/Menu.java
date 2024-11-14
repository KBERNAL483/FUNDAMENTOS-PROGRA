
package com.mycompany.segundoparcial;

import java.util.Scanner;

/**
 *
 * @author kaleb
 */
public class Menu {
    public static int main (String args[]) {
        
        Scanner scanner = new Scanner (System.in);
       
           
           do {
           imprimirMenu();
        System.out.print ("Selecciona una opcion");
        seleccion=scanner.nextInt();
        System.out.println(seleccion);
        
        switch(seleccion){
            case 0:
                System.out.println("Saliendo...\n");
                break;
            case 1:
                   System.out.println("1)Numeros primos\n");
                break;
            case 2: 
                  System.out.println("2)Factorial\n");
                break;
            case 3:
                System.out.println("3)Fibonacci\n");
                break;
            default:
        }
          }while(seleccion !=0)
             }
        
        public static void imprimirMenu(){
          
        System.out.println("------------------------------------------------");
        System.out.println("1) Nùmeros primos");
        System.out.println("2) Factorial");
        System.out.println("3) Fibonacci\n");
        
        System.out.println("0)Salir");
        
        seleccion = scanner.nextInt();
        
        System.out.println ("Seleccion");
    
       }  
    
    }
