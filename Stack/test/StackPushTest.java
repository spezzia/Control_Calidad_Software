/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import stack.Stack;

public class StackPushTest {
    
    
    @Test 
    public void Stackempty()
    {
        Stack prueba = new Stack();
        assertTrue(prueba.push("uno"));
    }
    
    @Test
    public void StackNoempty()
    {
        Stack prueba = new Stack();
        prueba.push("uno");
        assertTrue(prueba.push("dos"));
    }
    
    @Test
    public void PushinTop()
    {
        Stack prueba = new Stack();
        prueba.push("primero");
        prueba.push("Segundo");
        prueba.push("Ultimo");
        assertEquals("Ultimo",prueba.top());       
    }
    
    @Test(expected=RuntimeException.class)
    public void PushFueraDelLimite()
    {
        Stack prueba = new Stack();
        for(int i = 0; i < 10; i++)
        {
            prueba.push(String.valueOf(i));
        }
        prueba.push("11");       
    }
    
    
    
    
    
    
    
    
}
