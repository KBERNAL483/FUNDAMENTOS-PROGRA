
package com.mycompany.segundoparcial;

/**
 *
 * @author kaleb
 */
public class FactorialRecursivo {
   int calcular(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        
        return n * calcular(n-1);
    }
    
}
