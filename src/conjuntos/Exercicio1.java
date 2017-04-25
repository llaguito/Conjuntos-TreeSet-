/*
1)Fai un programa que lea tres cadenas e diga que letras as componen.
*/

package conjuntos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        TreeSet <Character> letras = new TreeSet <> ();
        ArrayList <String> cadenas = new ArrayList <> ();
        Scanner leer = new Scanner(System.in);
        String cad1;
        String cad2;
        String cad3;
        
        System.out.print("\nIntroduce primera cadena :");
        cadenas.add(leer.next());
        System.out.print("\nIntroduce segunda cadena :");
        cadenas.add(leer.next());
        System.out.print("\nIntroduce tercera cadena :");
        cadenas.add(leer.next());
        
        for ( int contador = 0; contador < cadenas.size(); contador++ ) {
            for ( int contadorList = 0; contadorList < cadenas.get(contador).length(); contadorList++ ) {
                letras.add(cadenas.get(contador).charAt(contadorList));
            }
        }
               
        System.out.print("\n" + letras.toString());
        
    }

}
