/*
2)Fai un programa que comprobé si unha serie de apostas foi premiada na lotería primitiva.
    1) Primeiro xenerarase unha combinación ganadora de 6 numeros enteiros de 1 a 49.
    2) Depois pregunte numero de apostas (numapostas) e cree un array de 6xnumeros os rellenando cada fila con unha aposta (combinación aleatoria de 6 num de 1-49)
    3)Recorra o array indicando o numero de acertos de cada aposta. 

*/

package conjuntos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leer = new Scanner(System.in);
        int numero;
        int numeroApuestas;
        TreeSet <Integer> numeros = new TreeSet <> ();
        
        int[] ganadora = new int[6];
        
        System.out.print("\n¿Cuantas apuestas quieres realizar? ");
        numeroApuestas = leer.nextInt();
        int[][] apuestas = new int [numeroApuestas][6];
        for ( int contadorFilas = 0; contadorFilas < apuestas.length; contadorFilas++) {
            numeros.clear();
            for ( int contadorColumnas = 0; contadorColumnas < apuestas[contadorFilas].length; contadorColumnas++ ) {
                numero = aleatorio.nextInt(49) + 1;
                while ( numeros.contains(numero) ){
                    numero = aleatorio.nextInt(49) + 1;
                }
                numeros.add(numero);
                apuestas[contadorFilas][contadorColumnas] = numero;
            }
            Arrays.sort(apuestas[contadorFilas]);
        }
        
        //Apuesta ganadora
        numeros.clear();
        for ( int contador = 0; contador < ganadora.length; contador++ ) {
            numero = aleatorio.nextInt(49) + 1;
            while ( numeros.contains(numero) ){
                numero = aleatorio.nextInt(49) + 1;
            }
            numeros.add(numero);
            ganadora[contador] = numero;
        }
        

        System.out.print("\nApuesta ganadora: "+numeros.toString());
        //Comprobacion de premio
        
        for ( int contador = 0; contador < apuestas.length; contador++ ) {
            System.out.print("\nValor de apuesta: ");
            for ( int contadorApuesta = 0; contadorApuesta < apuestas[contador].length; contadorApuesta++ ) {
                System.out.print(apuestas[contador][contadorApuesta]+" ");
            }
            System.out.print("\nEn la apuesta número "+(contador+1)+" coincide los números: ");

            for ( int contadorApuesta = 0; contadorApuesta < apuestas[contador].length; contadorApuesta++ ) {
                if ( numeros.contains(apuestas[contador][contadorApuesta]) ) {
                    System.out.print(apuestas[contador][contadorApuesta]+ " ");
                }
            }
                        
        }
        
        

    }

}
