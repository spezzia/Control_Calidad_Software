package icoffe;

import java.util.regex.Pattern;

public class Cafe {
    String nombre;
    int [] tamanios = new int[5];
   
    Cafe(String cadena)
    {
        cadena = cadena.replace(" ", "");
        if(!NoEsVacio(cadena) && Tamanio(cadena) && NombreInicio(cadena)){
             String [] descomp;
             descomp = cadena.split(",");
             String [] tamaños = new String[descomp.length - 1];
             for(int i = 1; i < descomp.length; i++)
             {
                 if(Numerico(descomp[i]) && tamBebi(descomp[i]))
                 {
                    tamaños[i-1] = descomp[i]; 
                 }
             }
             
             if(tamaños(tamaños))
             {
                 nombre = descomp[0];
                 System.out.println("El nombre de la bebida es: " + descomp[0] );
                 System.out.println("Tiene " + tamaños.length + " tamaños disponiles;" );
                 for(int w = 0; w < tamaños.length ; w++)
                 {
                     int n = w + 1;
                      System.out.println("El tamaño "+ n +" es: "+tamaños[w]+"oz" );
                      tamanios[w] = Integer.parseInt(tamaños[w]);
                 }
             }
        }
    } 
    
    public static Boolean NoEsVacio(String cadena)
    {    
        if(cadena.isEmpty())
            throw new RuntimeException("La cadena no debe de estar vacia");
        else
            return false;
    }
    
    
    public static Boolean Tamanio(String cadena)
    {
        String [] descomp;
        descomp = cadena.split(",");
        if(descomp.length >= 2 && descomp.length <= 6 )
            return true;
        else
             throw new RuntimeException("Al menos debe tener un nombre y entre 1 y 5 tamaños");
    }
    
    public static Boolean NombreInicio(String cadena)
    {
        String [] descomp;
        descomp = cadena.split(",");
        if(tamanioNombre(descomp[0]) && Alfabetico(descomp[0]))
        {
            return true;
        }
        else
        {
            throw new RuntimeException("El nombre debe de estar primero y debe de ser alfabetico");
        }
    }
    
    public static Boolean tamanioNombre(String nombre)
    {
        nombre = nombre.replace(" ", "");
        if(nombre.length() >= 2 && nombre.length() <= 15)
            return true;
        else
            throw new RuntimeException("El nombre debe tener 2 carcateres y maximo 15");
    }
    
    public static Boolean Alfabetico(String nombre)
    {
        nombre = nombre.replace(" ", "");
        return Pattern.matches("^[a-zA-Z]*$", nombre);
    }
    
    public static Boolean Numerico(String onza)
    {
        onza = onza.replace(" ", "");
        try {
                    Integer.parseInt(onza);
                    return true;
            }
            catch(Exception e)
            {
                    return false;	
            }
    }
    
    public static Boolean tamBebi(String onza)
    {
        if(Integer.parseInt(onza)>= 1 && Integer.parseInt(onza)<= 48)
            return true;
        else
             throw new RuntimeException("El tamaño de la bebida debe ser entre 1 y 48");
    }
    
    public static Boolean tamaños(String [] tamaños)
    {
        int aux = Integer.MIN_VALUE;
        for(int i = 0; i < tamaños.length; i++)
        {
            if(aux < Integer.parseInt(tamaños[i]))
            {
                aux =  Integer.parseInt(tamaños[i]);
            }
            else
            {
                  throw new RuntimeException("Los tamaños debe de ser ingresados de menor a mayor");
            }
        }
        return true;
    }
    
    
}
