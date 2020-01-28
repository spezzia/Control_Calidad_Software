/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import stack.Stack;

/**
 *
 * @author jluis
 */
public class StackTopTest {
    
   @Test(expected=RuntimeException.class)
   public void TopEmpty()
   {
        Stack prueba = new Stack();
        prueba.pop();
   }
   @Test
   public void TopNoEmpty()
   {
        Stack prueba = new Stack();
        prueba.push("Jorge");
        assertEquals("Jorge", prueba.pop());
   }
   
   @Test
   public void TopMostRecent()
   {
        Stack prueba = new Stack();
        prueba.push("Jorge");
        prueba.push("Pedro");
        assertEquals("Pedro", prueba.pop());
   }
   
   
   
   
    
}
