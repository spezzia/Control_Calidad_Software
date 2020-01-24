/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import icoffe.Cafe;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author jluis
 */
public class Cadena {
    
    @Rule       
    public ExpectedException thrown = ExpectedException.none();
    
    @Test(expected=RuntimeException.class) // La cadena de texto no se adminte vacia
    public void CadenaVacia() {
        Cafe.NoEsVacio("");
    }
    
    @Test
    public void CadenaNoVacia() { // La cadena de texto se adminte 
        assertFalse(Cafe.NoEsVacio("Caffe1"));
    }
    
    @Test
    public void mintamanio() // Al menos debe de tener un tamaño
    {
        assertTrue(Cafe.Tamanio("Cafe1,num1"));
    }
    
    @Test
    public void maxtamanio() // El numero maximo de tamaños es de 5
    {
       assertTrue(Cafe.Tamanio("Cafe1,1,2,3,4,5"));
    }
    @Test
    public void intamanio() // El numero de tamaños entre 1 y 5 se adminte
    {
        assertTrue(Cafe.Tamanio("Cafe1,1,2,3,4,5"));
    }
    
    @Test(expected=RuntimeException.class) // Menos del minimo de tamaños no se adminte
    public void minmintamanio()
    {
        Cafe.Tamanio("Cafe1");
    }
    
    @Test(expected=RuntimeException.class) // El mas de maximo de tamaños no se admite
    public void maxmaxtamanio()
    {
        Cafe.Tamanio("Cafe1,1,2,3,4,5,6");
    }
    
    @Test
    public void minnombre() // El nombre al menos debe de tener 2 caracteres
    {
        assertTrue(Cafe.tamanioNombre("aa"));
    }
    
    @Test
    public void maxnombre() // El nombre a lo mas debe de tener 15 caracteres
    {
        assertTrue(Cafe.tamanioNombre("asdfghjklzxcvbn"));
    }
    
    @Test
    public void innombre() // El nombre entre 2 y 15 caracteres es valido
    {
        assertTrue(Cafe.tamanioNombre("klzxcvbn"));
    }
    
    @Test(expected=RuntimeException.class)
    public void minminnombre() // Menos del minimo de 2 caracteres no es valido
    {
        Cafe.tamanioNombre("a");
    }
    
    @Test(expected=RuntimeException.class) 
    public void maxmaxnombre() // Mas de maximo de caracteres no es valido
    {
        Cafe.tamanioNombre("asdfghjklzxcvbnm");
    }
    
    @Test
    public void alfabetico() // El nombre debe de ser alfabatico
    {
        assertTrue(Cafe.Alfabetico("asdfgh"));
    }
    
    @Test
    public void Noalfabetico() // El nombre no es valido si tiene numeros
    {
        assertFalse(Cafe.Alfabetico("as 12"));
    }
    
     @Test
    public void EsNumero() // El tamaño de la bebida es valido si no tiene ninguna letra
    {
        assertTrue(Cafe.Numerico("12"));
        assertTrue(Cafe.Numerico("12 "));
        assertTrue(Cafe.Numerico("1 2"));
        assertTrue(Cafe.Numerico(" 12"));
    }
    
   @Test(expected=NumberFormatException.class)
    public void testConversion(){ // El tamaño de la bebida es no valido si tiene alguna letra 
        Integer.parseInt("as12");
        Integer.parseInt("12as");
        Integer.parseInt("1a2");
    }
    
    @Test(expected=NumberFormatException.class)
    public void testConversionDecimal(){ // El tamaño de la bebida es no valido si es decimal
        Integer.parseInt("12.1");
    }
    
    @Test
     public void minTamaño() // El tamaño al menos debe de ser de 1
    {
       assertTrue(Cafe.tamBebi("1"));
    }
     
    @Test
     public void maxTamaño() // El tamaño maximo de la bebida debe de ser 48
    {
       assertTrue(Cafe.tamBebi("48"));
    }
     
     @Test
     public void inTamaño() // El tamaño entre 1 y 48 es valido
    {
       assertTrue(Cafe.tamBebi("12"));
    }
    
    @Test(expected=RuntimeException.class)
    public void minminTamaño() // Si el tamaño es menor al minimo, no es valido
    {
       Cafe.tamBebi("0");
    }
    
    @Test(expected=RuntimeException.class)
    public void maxmaxTamaño() // Si el tamaño es mayor al maximo, no es valido
    {
       Cafe.tamBebi("0");
    }
    
    @Test
    public void ascendente() // El tamaño entre 1 y 48 es valido
    {
       assertTrue(Cafe.tamaños(new String []{"1","2","3","4"} ));
    }
    
    @Test(expected=RuntimeException.class)
    public void Noascendente() // El tamaño entre 1 y 48 es valido
    {
       Cafe.tamaños(new String []{"1","5","3","4"} );
       Cafe.tamaños(new String []{"5","1","3","4"} );
    }
    
    
    @Test
    public void NombreAlInicio() // El el nombre debe de estar al inicio de la cadena
    {
       assertTrue(Cafe.NombreInicio("jorge,1,2,3,4"));
    }
    
    @Test(expected=RuntimeException.class)
    public void NombreNoInicio() // El el nombre debe de estar al inicio de la cadena
    {
       Cafe.NombreInicio("1,jorge,2,4");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
