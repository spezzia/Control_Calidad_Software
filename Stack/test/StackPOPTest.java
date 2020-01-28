/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import stack.Stack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jluis
 */
public class StackPOPTest {
    
   Stack prueba;
    
    @Before
    public void setUp() {
        prueba = new Stack(); 
    }
    
    @Test(expected=RuntimeException.class)
    public void popempty()
    {
        prueba.pop();
    }
    
    @Test
    public void popnoemty(){
        prueba.push("Hola");
        assertEquals("Hola", prueba.pop());    
    }
    
    @Test
    public void popRecent(){
        prueba.push("1");
        prueba.push("2");
        assertEquals("2", prueba.pop());    
    }
    
    
}
