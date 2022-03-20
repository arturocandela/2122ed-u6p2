package es.cipfpbatoi.ed.u6p2;

import ed.carolina.Calculadora;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculadora calculadora = new Calculadora();
        
        System.out.println("2+2=" + calculadora.suma(2, 2));
        System.out.println("3-2=" + calculadora.resta(3, 2));
        System.out.println("2*4=" + calculadora.multiplica(2, 4));
        System.out.println("6/2=" + calculadora.diveix(6, 2));
        
       
        
    }
}
