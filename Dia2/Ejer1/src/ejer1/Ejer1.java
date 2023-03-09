/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package ejer1;

/**
 * @author Martin Chiappero
 */
import java.util.Scanner;
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in); // Creamos el Scanner
        System.out.print("Ingrese el primer numero a sumar: ");
        int num1=leer.nextInt();
        System.out.print("Ingrese el segundo numero a sumar: ");
        int num2=leer.nextByte();
       
        System.out.println("La suma de los dos numeros es: "+ (num1+num2));
    }
    
}
