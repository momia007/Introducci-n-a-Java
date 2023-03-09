/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package ejer4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        System.out.println("El doble de "+ numero + " es: "+ numero*2);
        System.out.println("El triple de "+ numero + " es: "+ numero*3);
        System.out.println("La raiz cuadrada de "+ numero +" = "+ Math.sqrt(numero));
    }
    
}
