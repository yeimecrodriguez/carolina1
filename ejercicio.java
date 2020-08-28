package g2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class G2EJERCICIO2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int radio,areacir,areacuadrado,areasomb,radio2,radio3;
        System.out.println("Ingrese el radio del circulo:");
        radio = teclado.nextInt();
        radio = teclado.nextInt();
        areacir = (int) (Math.PI/(Math.pow(radio,2)));
        areacuadrado = (int) (4*(Math.pow(radio,2)));
        areasomb = (int) ((Math.PI*(Math.pow(radio, 2))) - (2*(Math.pow(radio, 2))));
        System.out.println("el radio de la parte sombreada es: "+areasomb);
    }
    System.out.println("el area de la parte sombreada es: "+areasomb);
    }
     System.out.println("Ingrese el radio del circulo:");
}