
package com.mycompany.segundoparcial;

import java.util.Scanner;

/**
 *
 * @author kaleb
 */
public class Fibonacci {
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        int seleccion;
                
        do{            
           imprimirMenu();
            
            seleccion = scanner.nextInt();
            //System.out.println(seleccion);
            
            System.out.println("\n------------------------------------------\n");
            
            switch(seleccion){
                case 0:
                    System.out.println("Saliendo ...\n");
                    break;
                case 1:
                    System.out.println("Números Primos\n");
                    ejecutarNumerosPrimos();
                    break;
                case 2:
                    System.out.println("Factorial\n");
                    ejecutarFactorial();
                    break;
                case 3:
                    System.out.println("Fibonacci\n");
                    break;
                case 4:
                    System.out.println("Factorial Recursivo\n");
                    ejecutarFactorialRecursivo();
                    break;
                case 5:
                    System.out.println("Fibonacci Recursivo\n");
                    ejecutarFibonacciRecursivo();
                    break;
                case 6:
                    System.out.println("Sumar los dígitos de un número (TAREA)\n");
                    ejecutarSumaDigitos();
                    break;
                default:
                    System.out.println("Opción inválida ...\n");
                    break;
            }
            
        }while(seleccion != 0);
    }
    
    public static void imprimirMenu(){
        System.out.println("\n------------------------------------------\n");
        
        System.out.println("1) Número primos");
        System.out.println("2) Factorial");
        System.out.println("3) Fibonacci");
        System.out.println("4) Factorial Recursivo");
        System.out.println("5) Fibonaccci Recursivo");
        System.out.println("6) Suma de dígitos de un número");
        
        System.out.println("\n0) Salir");
        
        System.out.print("\n\nSelecciona una opción: ");
    }
    
    public static int ejecutarNumerosPrimos(){
        
       System.out.print("Indica la cantidad de numeros primos a encontrar de elementos a encontrar: ");
       Scanner scanner = new Scanner(System.in);
        
       int numero = scanner.nextInt(); 
       
        Primos primos = new Primos();
        primos.encontrarNumeros(numero);
                
       return 0;
    }
    
    public static int ejecutarFactorial(){
        
        System.out.print("Indica el número al que se calculará el factorial: ");
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        Factorial factorial = new Factorial();
        int res = factorial.calcularFactorial(numero);
        
        System.out.println(numero + "! = " + res);
        
        return 0;
    }
    
    public static int ejecutarFactorialRecursivo(){
        System.out.print("Indica el número al que se calculará el factorial: ");
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        FactorialRecursivo fr = new FactorialRecursivo();
        
        int res = fr.calcular(numero);

        System.out.println(numero + "! = " + res);
        
        return 0;
    }
    
    public static int ejecutarFibonacciRecursivo(){
        System.out.print("Indica el número de elemento de la serie de fibonacci que se quiere obtener: ");
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        FibonacciRecursivo fr = new FibonacciRecursivo();
        int res = fr.calcular(numero);
        
        System.out.println(res);
        
        return 0;
    }
}
}
