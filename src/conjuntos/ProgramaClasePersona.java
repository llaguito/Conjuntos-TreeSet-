package conjuntos;

import Clases.Persona;
import java.util.ArrayList;
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

        muchas.add(new Persona("Santiago", 354490458, "44487709M", "Losada"));
        muchas.add(new Persona("Alexis", 789456123, "44444488L",  "Sierra"));
        muchas.add(new Persona("Boris", 456789123, "78945612A", "Álvarez"));
        
        ArrayList <String> menu = new ArrayList <> ();
        menu.add("1 - Altas");
        menu.add("2 - Bajas");
        menu.add("3 - Modificaciones");
        menu.add("4 - Imprimir todo");
        menu.add("5 - Salir");
        
        ArrayList <String> modificaciones = new ArrayList <> ();
        modificaciones.add("1 - Nombre");
        modificaciones.add("2 - Apellido");
        modificaciones.add("3 - Telefono");
        modificaciones.add("4 - Terminar");
                
        int respuestaWhileInicial = 0;
        String respuestaCase2 = "S";
        int respuestaModificaciones = 0;
        boolean comprobacion;
        String dni;
        String nombre;
        String apellido;
        int telefono;
        while (respuestaWhileInicial != 5) {
            
            for (int contador = 0; contador < menu.size(); contador ++) {
                System.out.print("\n"+menu.get(contador));
            }
            
            System.out.print("\n¿Que opción escoges? ");
            respuestaWhileInicial = leer.nextInt();
            
            switch (respuestaWhileInicial) {
                case 1:
                    System.out.print("\n\nALTAS:");
                    System.out.print("\nIntroduce DNI: ");
                    dni = leer.next();

                    for (Persona persona : muchas) {
                        while (persona.compararDni(dni)) {
                            System.out.print("\nEl DNI ya existe, escribe el correcto.\nDNI: ");
                            dni = leer.next();
                        }
                    }
                    
                    System.out.print("\nIntroduce Nombre: ");
                    nombre = leer.next();
                    System.out.print("\nIntroduce Apellido: ");
                    apellido = leer.next();
                    System.out.print("\nIntroduce Teléfono: ");
                    telefono = leer.nextInt();
                    
                    Persona nueva = new Persona(nombre, telefono, dni, apellido);
                    muchas.add(nueva);
                    
                    break;
                   
                case 2:
                    Persona una = new Persona();
                    respuestaCase2 = "S";
                    while (respuestaCase2.equalsIgnoreCase("S")) {
                        comprobacion = false;
                        System.out.print("\n\nBAJAS:");                    
                        System.out.print("\nIntroduce el DNI que deseas dar de baja: ");
                        dni = leer.next();

                        for (Persona persona : muchas) {
                            if (persona.compararDni(dni)) {
                                comprobacion = true;
                                una = persona;
                            }
                        }
                        
                        if (comprobacion == true) {
                            muchas.remove(una);
                            System.out.print("\nDni dado de baja con exito.\n");
                            respuestaCase2 = "N";
                        }
                        else {
                            System.out.print("\nNo se ha encontrado el DNI.\n¿Introducir otro? S/N ");
                            respuestaCase2 = leer.next();
                        }
                    }
                    break;
                    
                case 3:
                    
                    System.out.print("\n\nMODIFICACIONES:");                    
                    System.out.print("\nIntroduce DNI para realizar modificaciones: ");
                    dni = leer.next();
                    while (respuestaModificaciones != 4) {
                        for (Persona persona : muchas) {
                            while (persona.compararDni(dni)) {
                                
                                for (int contador = 0; contador < modificaciones.size(); contador ++) {
                                    System.out.print("\n"+modificaciones.get(contador));
                                }
                                System.out.print("\nQue quieres modificar: ");
                                respuestaModificaciones = leer.nextInt();
                                
                                switch (respuestaModificaciones) {
                                    
                                    case 1:
                                        System.out.print("\nNuevo Nombre: ");
                                        persona.setNombre(leer.next());
                                        System.out.print("Modificacion realizada con éxito.");
                                        break;
                                        
                                    case 2:                                        
                                        System.out.print("\nNuevo Apellido: ");
                                        persona.setApellido(leer.next());
                                        System.out.print("Modificacion realizada con éxito.");
                                        break;
                                        
                                    case 3:    
                                        System.out.print("\nNuevo Teléfono: ");
                                        persona.setTelefono(leer.nextInt());
                                        System.out.print("Modificacion realizada con éxito.");
                                        break;
                                        
                                    case 4:
                                        dni = "";
                                }
                                
                            }
                        }
                    }
                    break;
                    
                case 4:
                    for (Persona persona : muchas) {
                        System.out.print("\nNombre: \t"+persona.getNombre()+"\nApellido: \t"+persona.getApellido()+"\nDNI: \t\t"+persona.getDni()+"\nTelefono: \t"+persona.getTelefono()+"\n");
                    }
                    break;
            }

        }

    }
        
}


