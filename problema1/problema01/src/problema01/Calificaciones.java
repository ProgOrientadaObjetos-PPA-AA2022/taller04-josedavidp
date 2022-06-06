/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author josed
 */
public class Calificaciones {
    private String nombreEstudiante;
    private double mat1;
    private double mat2;
    private double mat3;
    private double promedio;

    public Calificaciones() {
        nombreEstudiante = "José David";
        mat1 = 10.0;
        mat2 = 9.4;
        mat3 = 8.1;

    }

    public Calificaciones(String nombre, double materia1,
            double materia2, double materia3) {

        nombreEstudiante = nombre;
        mat1 = materia1;
        mat2 = materia2;
        mat3 = materia3;
    }

    public void establecerNombreEstudiante(String c) {
        nombreEstudiante = c;
    }

    public void establecerMateria1(double c) {
        mat1 = c;
    }

    public void establecerMateria2(double c) {
        mat2 = c;
    }

    public void establecerMateria3(double c) {
        mat3 = c;
    }

    public void calcularPromedio() {
        promedio = (mat1 + mat2 + mat3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerMateria1() {
        return mat1;
    }

    public double obtenerMateria2() {
        return mat2;
    }

    public double obtenerMateria3() {
        return mat3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Calificaciones: \n"
                + "Nombre del Estudiante: %s\n"
                + "Materia 1 : %.2f\n"
                + "Materia 2: %.2f\n"
                + "Materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerMateria1(),
                obtenerMateria2(),
                obtenerMateria3(),
                obtenerPromedio());

        return cadena;
    }

}
