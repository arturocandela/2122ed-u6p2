package es.cipfpbatoi.ed.u6p2;

import ed.adria.Calculadora;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Calculadora" );
        
        Calculadora calculadora = new Calculadora();
        
        System.out.print(calculadora.oper3(9));
    }
}
