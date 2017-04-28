/*
3)Crea unha clase Persoa, cas variables dni,nome ,apel,tlf, crea un menú que permita xestionar unha lista de persoas , altas,baixas e modificacions, no apartado de altas, cando se introduce o dni deberá controlar que non existe ningún alumno que se intenta dar de alta duas veces..
*/

package Clases;

/**
 *
 * @autor Santiago Losada Borrajo
 */
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int telefono;
    private String dni;
    private String apellido;
    
    public Persona (){}
    
    public Persona (String nombre, int telefono, String dni, String apellido) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
        this.apellido = apellido;
    }
    
    public String getNombre () {
        return this.nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono () {
        return this.telefono;
    }
    
    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
    
    public boolean compararDni (String dni) {
        if (this.dni.equalsIgnoreCase(dni)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String getDni () {
        return dni;
    }
    
    public void setDni ( String dni) {
        this.dni = dni;
    }
    
    public String getApellido () {
        return this.apellido;
    }
    
    public void setApellido (String apellido) {
        this.apellido = apellido;
    }
    
    public int soloNumeroDNI () {
        return Integer.parseInt(this.dni.substring(0, 8));
    }
    
    public String letraDNI (){
        String letra = ""+this.dni.charAt(8);
        return letra;
    }
    
    @Override
    public int compareTo(Persona compara) {
        
        if ( this.soloNumeroDNI() < compara.soloNumeroDNI() ) {
            return -1;
        }
        else if ( this.soloNumeroDNI() > compara.soloNumeroDNI()){
            return 1;
        }
        else {
            return 0;
        }
    }
    
}
