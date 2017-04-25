package conjuntos;

import java.util.TreeSet;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Object {

    public static void main(String[] args) {
        TreeSet <Integer> alexis = new TreeSet <> ();
        alexis.add(1);
        alexis.add(2);
        alexis.add(3);
        alexis.add(4);
        
        for ( Integer llaguito : alexis ){
            System.out.print("\n"+llaguito);
        }
    }

}
