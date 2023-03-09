/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase en minuscula");
        frase=entrada.nextLine();
        System.out.println("La frase en mayuscula es: "+ frase.toUpperCase());
        
        
    }
    
}
