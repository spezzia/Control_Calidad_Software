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
public class StackEmptyTest {
    
    @Test
    public void isEmpty()
    {
        Stack prueba = new Stack();
        assertTrue(prueba.isEmpty());
    }
    
    @Test
    public void NoEmpty()
    {
        Stack prueba = new Stack();
        prueba.push("Jorge");
        assertFalse(prueba.isEmpty());
    }
    
    
}
