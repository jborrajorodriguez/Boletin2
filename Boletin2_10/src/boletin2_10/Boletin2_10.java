
package boletin2_10;

import java.util.Scanner;

public class Boletin2_10 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float soldo_fixo,total_ventas,km,dias_desplazamiento,soldo_bruto,soldo_liquido;
        System.out.println("Soldo Fixo");
        soldo_fixo=teclado.nextFloat();
        System.out.println("Total de Ventas");
        total_ventas=teclado.nextFloat();
        System.out.println("Kilometros");
        km=teclado.nextFloat();
        System.out.println("Dias de desplazamiento");
        dias_desplazamiento=teclado.nextFloat();
        soldo_bruto=(float) (soldo_fixo+(0.05*total_ventas)+2*km+30*dias_desplazamiento);
        float irpf=(float) 0.18;
        float retencion_seguridad_social=36;
        soldo_liquido=(float) (soldo_bruto-(irpf*soldo_bruto)-retencion_seguridad_social);
        System.out.println("Sueldo bruto = "+soldo_bruto);
        System.out.println("Sueldo liquido = "+soldo_liquido);
        

    }
    
}
