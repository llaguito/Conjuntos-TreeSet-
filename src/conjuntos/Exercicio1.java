/*
1)Fai un programa que lea tres cadenas e diga que letras as componen.
*/

package conjuntos;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        TreeSet <Character> letras = new TreeSet <> ();
        Scanner leer = new Scanner(System.in);
        String cad1;
        String cad2;
        String cad3;
        
        System.out.print("\nIntroduce primera cadena :");
        cad1 = leer.next();
        System.out.print("\nIntroduce segunda cadena :");
        cad2 = leer.next();
        System.out.print("\nIntroduce tercera cadena :");
        cad3 = leer.next();
        
        for ( int contador = 0; contador < cad1.length(); contador++ ) {
            letras.add(cad1.charAt(contador));
        }
        
        for ( int contador = 0; contador < cad2.length(); contador++ ) {
            letras.add(cad2.charAt(contador));
        }
        
        for ( int contador = 0; contador < cad3.length(); contador++ ) {
            letras.add(cad3.charAt(contador));
        }
        
        System.out.print("\n" + letras.toString());
        
    }

}
