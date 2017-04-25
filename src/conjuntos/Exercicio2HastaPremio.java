package conjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Exercicio2HastaPremio {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        TreeSet <Integer> ganadora = new TreeSet <> ();
        ArrayList <TreeSet> numerosBoletos = new ArrayList <> ();
        TreeSet <Integer> boletos;
        Integer[] boleto = new Integer[6];
        Scanner leer = new Scanner(System.in);
        int numero;
        int contadorAciertos = 0;
        int contadorBoletos = 0;
        
        
        //Combinacion ganadora
        for ( int contador = 0; contador < 6; contador++ ) {
            numero = aleatorio.nextInt(49) + 1;
            while ( ganadora.contains(numero) ){
                numero = aleatorio.nextInt(49) + 1;
            }
            ganadora.add(numero);
        }
           
        //Apuesta ganadora
        System.out.print("\nApuesta ganadora: "+ganadora.toString()); 
        
        //Programa de busqueda de aciertos
        while ( contadorAciertos !=6 ){
            //Reiniciamos cuantia de aciertos
            contadorAciertos = 0;
            
            //Construimos un boleto
            boletos = new TreeSet <> ();
            for ( int contador = 0; contador < 6; contador++ ) {
                numero = aleatorio.nextInt(49) + 1;
                while ( boletos.contains(numero) ){
                    numero = aleatorio.nextInt(49) + 1;
                }
                boletos.add(numero);
            }
            numerosBoletos.add(boletos);
            
            //Imprimimos el boleto
            System.out.print("\nEl boleto número "+(contadorBoletos + 1)+": "+numerosBoletos.get(contadorBoletos).toString()+"\nCoinciden los números: ");
            
            //Buscamos numero que coincidan en la apuesta ganadora
            boleto = (Integer[]) numerosBoletos.get(contadorBoletos).toArray();
            for ( int contador = 0; contador < boleto.length; contador++ ) {
                numero = boleto[contador];
                if ( ganadora.contains(numero)) {
                    System.out.print(numero+" ");
                    contadorAciertos++;
                } 

            }
            
            
            
            //Añadimos un boleto
            contadorBoletos++;
            
        }
        
        System.out.print("\nSe ha comprobado "+contadorBoletos+" boletos.");

    }

}
