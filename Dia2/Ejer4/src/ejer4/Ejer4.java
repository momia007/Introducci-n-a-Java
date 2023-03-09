/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejer4;

import java.util.Scanner;

/**
 *
 * @author Martin Chiappero
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        
        float grados,faren;
        System.out.print("Ingrese los grados a convertir a Fahrenheit: ");
        grados=leer.nextFloat();
        System.out.println("");
        faren=32 + (9 * grados / 5);
        System.out.println(grados+"°, son equivalentes a "+faren+" Fahrenheit");
    }
    
}
