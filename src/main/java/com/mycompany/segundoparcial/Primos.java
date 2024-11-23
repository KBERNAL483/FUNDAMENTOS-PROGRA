
package com.mycompany.segundoparcial;



/**
 *
 * @author kaleb
 */
public class Primos {
      int limite = 8;
    
    public Primos(){}

    
    public int encontrarNumeros(int n){
        limite = n;  
        return encontrarNumeros();
    }
    
    private int encontrarNumeros(){
              
        int contador = 0;
        
        for(int i=1;; i++){
            boolean es_primo = esPrimo(i);
            
            if(es_primo){
                System.out.println(i);
                contador++;
                
                if(contador == limite)
                    break;
            }
        }
        
        return 0;
    }
    
    public boolean esPrimo(int a){
        
        boolean primo = true;
                
        for(int i=2; i<= Math.sqrt(a); i++){
            if(a%i == 0){
                primo = false;
                break;
            }
        }
        
        //if(primo){
        //    System.out.println(a + " es un número primo");
        //} else {
        //    
        //    System.out.println(a + " NO es un número primo");
        //}
        
        return primo;
    }
}