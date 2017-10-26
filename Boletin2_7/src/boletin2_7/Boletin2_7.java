
package boletin2_7;

import java.util.Scanner;

public class Boletin2_7 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float c,k,f;
        System.out.println("Introduce los grados Centigrados");
        c=teclado.nextFloat();
        k=(float) (c*1.8+32);
        f=(float) (c+273.15);
        System.out.println("grados centrigrados="+c+"\nGrados F="+f+"\nGrados K="+k);
       
    }
    
}
