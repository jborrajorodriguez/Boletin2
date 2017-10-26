
package boletin2_5;

import java.util.Scanner;


public class Boletin2_5 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float cambio=1852,millas,metros,km;
        System.out.println("Introducir millas");
        millas=teclado.nextFloat();
        metros=cambio*millas;
        km=metros/1000;
        System.out.println(millas+"= "+metros+"m"+"="+km);
        
    }
    
}
