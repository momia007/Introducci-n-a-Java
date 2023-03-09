/*
Programa que lea dos números pasados por teclado y muestre el mayor en pantalla.
Si son iguales deberá mostrar un mensaje indicándolo.
 */
package numeromayor;

import java.util.Scanner;

/**
 *
 * @author Martin Chiappero
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Programa que le devolvera el mayor de 2 numeros dados");
        System.out.println("");
        System.out.println("");
        System.out.print("Ingrese el primer número: ");
        int num1=leer.nextInt();
        System.out.println("");
        System.out.print("Ingrese el segundo número: ");
        int num2=leer.nextInt();
        System.out.println("");
        if(num1>num2)
            System.out.println("El mayor de los dos es: "+num1);
        else if(num1==num2)
            System.out.println("Los dos numeros son iguales, no hay mayor");
        else 
            System.out.println("El mayor de los dos es: "+num2);
    }
    
}
