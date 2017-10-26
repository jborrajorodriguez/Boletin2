
package boletin2_8;

import java.util.Scanner;


public class Boletin2_8 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float billetes100,billetes20,billetes5,monedas1;
        System.out.println("Billetes de 100");
        billetes100 = teclado.nextFloat();
        System.out.println("Billetes de 20");
        billetes20 = teclado.nextFloat();
        System.out.println("billetes de 5");
        billetes5 = teclado.nextFloat();
        System.out.println("Monedas de 1");
        monedas1= teclado.nextFloat();
        
        float suma100=billetes100 *100;
        float suma20=billetes20 *20;
        float suma5=billetes5 *5;
        
        float suma=suma100+suma20+suma5+monedas1;
        System.out.println("Resultado"+suma);
        
        
        
        
    }
    
}
