/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author josed
 */
public class Sueldos {

    private String nombre;
    private String apellido;
    private double sueldo;
    private double sueldoTotal;
    private String cedula;

    public Sueldos() {
        nombre = "José";
        apellido = "Piedra";
        sueldo = 490.5;
        cedula = "1104806098";

    }

    public Sueldos(String nom, String ape,
            String ced, double sueldoase) {

        nombre = nom;
        apellido = ape;
        cedula = ced;
        sueldo = sueldoase;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerSueldo(double c) {
        sueldo = c;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldo + (sueldo * 0.2);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Sueldos de Docentes: \n"
                + "Nombre del Docente: %s\n"
                + "Apellido del Docente: %s\n"
                + "Cedula : %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerSueldo(),
                obtenerSueldoTotal());

        return cadena;
    }
}
