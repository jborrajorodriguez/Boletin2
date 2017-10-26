package boletin2_9;

import java.util.Scanner;

public class Boletin2_9 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int cantidad,billetes100,billetes20,billetes5,monedas1;
        System.out.println("Introducir cantidad");
        cantidad =teclado.nextInt();
        billetes100=cantidad/100;
        billetes20=(cantidad%100)/20;
        billetes5=((cantidad%100)%20)/5;
        monedas1=(((cantidad%100)%20)%5);
        System.out.println("Billetes de 100 = "+billetes100+"\nBilletes de 20 = "+billetes20+"\nBilletes de 5 = "+billetes5+"\nMonedas de 1 = "+monedas1);
        
       
    }
    
}
