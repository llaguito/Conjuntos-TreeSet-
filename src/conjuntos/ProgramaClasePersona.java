package conjuntos;

import Clases.Persona;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class ProgramaClasePersona {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TreeSet <Persona> muchas = new TreeSet <> ();
        Persona yo = new Persona("Santiago", 610415149, "44487709M", "Losada");
        Persona alexis = new Persona("Alexis", 789456123, "44444488L",  "Ro");
        Persona boris = new Persona("Boris", 456789123, "78945612A", "Gua");
        muchas.add(yo);
        muchas.add(alexis);
        muchas.add(boris);
        
        for ( Persona nombres : muchas ) {
            Persona nombre = nombres;
            System.out.print("\nNombre: \t"+nombres.getNombre()+" "+nombres.getApellido()+"\nTeléfono: \t"+nombres.getTelefono()+"\nDNI: \t"+nombres.getDni());
        }
    }

}
