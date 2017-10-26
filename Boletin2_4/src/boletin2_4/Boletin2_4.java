
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {
    
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        float n1,n2,suma,resta,multiplicacion,division;
        System.out.println("introducir número 1");
        n1 = teclado.nextFloat();
        System.out.println("Introducir número 2");
        n2 = teclado.nextFloat();
        suma=n1+n2;
        resta=n1-n2;
        multiplicacion=n1*n2;
        division=n1/n2;
        System.out.println("suma = "+suma +"\nresta = "+resta+"\nmultiplicacion = "+multiplicacion+"\ndivision = "+division);
        
               
    }
    
}
