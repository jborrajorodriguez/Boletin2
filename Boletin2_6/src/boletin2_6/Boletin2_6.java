
package boletin2_6;

import java.util.Scanner;

public class Boletin2_6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float n1,n2,descuento;
        System.out.println("Introducir número 1 ");
        n1=teclado.nextFloat();
        System.out.println("Introducir número 2 ");
        n2=teclado.nextFloat();
        descuento=100-(n2*100/n1);
        System.out.println("Descuento de "+descuento+"%");
        
       
    }
    
}
