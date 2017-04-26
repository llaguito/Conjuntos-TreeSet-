package conjuntos;

import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Exercicio2Hasta6SinCargoDeMemoria {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        TreeSet <Integer> ganadora = new TreeSet <> ();
        TreeSet <Integer> boletos = new TreeSet <>();
        Object[] boleto = new Object [6];
        int numero;
        int contadorAciertos = 0;
        int contadorBoletos = 0;
        int contadorBoletos3 = 0;
        int contadorBoletos4 = 0;
        int contadorBoletos5 = 0;
        int contadorBoletos6 = 0;
               
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
        while ( contadorBoletos != 1000000000 ){
            //Reiniciamos cuantia de aciertos
            contadorAciertos = 0;
            
            //Construimos un boleto
            boletos.clear();
            for ( int contador = 0; contador < 6; contador++ ) {
                numero = aleatorio.nextInt(49) + 1;
                while ( boletos.contains(numero) ){
                    numero = aleatorio.nextInt(49) + 1;
                }
                boletos.add(numero);
            }
           
            //Buscamos numero que coincidan en la apuesta ganadora
            boleto = boletos.toArray();
            for ( int contador = 0; contador < boleto.length; contador++ ) {
                numero = (Integer) boleto[contador];
                if ( ganadora.contains(numero)) {
                    contadorAciertos++;
                }

            }
            
            if (contadorAciertos == 3) {
                contadorBoletos3++;
            }
            
            if (contadorAciertos == 4) {
                contadorBoletos4++;
            }
                        
            if (contadorAciertos == 5) {
                contadorBoletos5++;
            }
                        
            if (contadorAciertos == 6) {
                contadorBoletos6++;
            }
            
            //Añadimos un boleto
            contadorBoletos++;
            
        }
        
        System.out.print("\nSe ha comprobado "+contadorBoletos+" boletos.\nHan salido "+contadorBoletos3+" de 3 aciertos.\nHan salido "+contadorBoletos4+" de 4 aciertos.\nHan salido "+contadorBoletos5+" de 5 aciertos.\nHan salido "+contadorBoletos6+" de 6 aciertos.");
        
        

    }

}
