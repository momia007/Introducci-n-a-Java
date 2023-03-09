/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package ejer.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre");
        
        nombre=entrada.next();
        
        System.out.println("su nombre es "+nombre);
    }
    
}
