
package com.martin.desafio2;

import java.util.Scanner;

/**
 * Desafio 2 Java SE
 * @author Martin
 */
public class Desafio2 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
     int numero1=0;
     int numero2=0;
     int resultado=0;
     int repetir=0;
     do {
         System.out.println( "Seleccione opcion a realizar  :" );
         System.out.println("1-Sumar");
         System.out.println("2-Restar");
         System.out.println("3-Multiplicar");
         System.out.println("4-Dividir");
         System.out.println("5-SALIR");
         repetir= leer.nextInt();
              if (repetir !=5) {
                System.out.println("Inserte primer numero");
                numero1= leer.nextInt();
                System.out.println("Inserte segundo numero");
                numero2= leer.nextInt();
                
              }
        switch(repetir){
            case 1: repetir=1;
            resultado= numero1 + numero2;
            System.out.print("el resultado de la suma es:  " + " " + resultado);
            break;
            case 2: repetir=2;
            resultado= numero1 - numero2;
            System.out.print("el resultado de la resta es:"+resultado);
            break;
            case 3: repetir=3;
            resultado= numero1 * numero2;
            System.out.print("el resultado de la multiplicacion es:"+resultado);
            break;
            case 4: repetir=4;
            resultado= numero1 / numero2;
            System.out.print("el resultado de la division es:"+resultado);
            break;
        }
     } while (repetir !=5);
       System.out.println("Elegiste salir ");
    }
}
