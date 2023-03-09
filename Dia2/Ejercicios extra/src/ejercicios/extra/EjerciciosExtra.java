/*
Realiza un programa en Java que lea dos números pasados por teclado y
muestre la suma por pantalla.
 */
package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Martin Chiappero
 */
public class EjerciciosExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros por teclado los cuales el sistema le devolvera la sumade los mismos");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int suma=num1+num2;
        
        System.out.println("");
        System.out.println("El resultado de la suma es:");
        System.out.println(suma);
        
    }
    
}
