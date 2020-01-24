/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icoffe;

import java.util.Scanner;

public class ICoffe {
    
    public static void main(String[] args) {
        String nombre;
        System.out.print("Ingresa un nuevo cafe: ");
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        Cafe nuevo = new Cafe(nombre);
    }
}
