
package com.mycompany.segundoparcial;

/**
 *
 * @author kaleb
 */
public class FibonacciRecursivo {
     public int calcular(int n){
        if(n==1){
            return 0;
        }
        
        if(n==2){
            return 1;
        }
        
        return calcular(n-1) + calcular(n-2);
    }
}
    

