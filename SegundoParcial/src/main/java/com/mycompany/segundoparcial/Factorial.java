
package com.mycompany.segundoparcial;

/**
 *
 * @author kaleb
 */
public class Factorial {
    int numero = 5;
    
    public int calcularFactorial(){
        
        int factorial = 1;
        
        for(int i=numero; i>1; i--){
            factorial *= i;
        }
        
        return factorial;
    }
    
    public int calcularFactorial(int n){
        numero = n;
        
        return calcularFactorial();
    }
    
    public int calcularFactorial2(int n){
        int factorial = 1;
        
        for(int i=2; i<=n; i++){
            factorial *= i;
        }
        
        return factorial;
    }
}
    
