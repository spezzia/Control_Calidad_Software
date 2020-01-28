/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author jluis
 */
public class Stack {

    String [] stack = new String[10];
    int indice;
    public Stack()
    {
        indice = -1;
    }
    public static void main(String[] args) {
        Stack pila = new Stack();
        int opc;
        do
        {
            System.out.println("1.- Ingresar dato a la pila");
            System.out.println("2.- Sacar dato de la pila");
            System.out.println("3.- Mostrar ultimo dato de la pila");
            System.out.println("4.- ¿Esta vacia la pila?");
            System.out.println("5.- Salir");
            System.out.print("Accion a realizar: ");
            Scanner teclado = new Scanner(System.in);
            opc = Integer.parseInt(teclado.nextLine());
            switch(opc)
            {
                case 1:
                    System.out.print("String a ingresar a la pila: ");
                    pila.push(teclado.nextLine());
                    System.out.println("Ingresado correctamente...");
                    break;
                case 2:
                    System.out.println("Sacar dato.");
                    System.out.println("El dato sacado es:" + pila.pop());        
                    break;
                case 3:
                    System.out.println("Mostrar ultimo dato ingresado en la pila");
                    System.out.println("El ultimo dato ingresado fue: " + pila.top());
                    break;
                case 4:
                    if(pila.isEmpty())
                        System.out.println("La pila esta vacia");
                    else
                        System.out.println("La pila esta no esta vacia");
                    break;
            }
        }while(opc < 5);
        
    }
    
    public String pop() 
    {
        if(indice < 0)
        {
            throw new RuntimeException("No hay elementos en la pila");
        }
        else
        {
            String aux = stack[indice];
            indice--;
            return aux;
        }
    }
    
    public boolean push(String aux)
    {
        if(indice < 10)
        {
            indice++;
            stack[indice] = aux;
            return true;
        }
        else
        {
            throw new RuntimeException("La pila esta llena");
        }
    }
    
    public String top()
    {
        if(indice < 0)
        {
            throw new RuntimeException("No hay elementos en la pila");
        }
        else
        {
            return stack[indice];
        }
    }
    
    public boolean isEmpty()
    {
        if(indice < 0 )
            return true;
        else
            return false;
    }
}
