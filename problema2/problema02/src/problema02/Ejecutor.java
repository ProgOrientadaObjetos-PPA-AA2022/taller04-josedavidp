/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author josed
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sueldos suel = new Sueldos();
        suel.calcularSueldoTotal();

        String nombre = "Wilson";
        String apellido = "Ontaneda";
        String cedu = "110548954";
        double sueldo = 825.69;

        Sueldos suel1 = new Sueldos(nombre, apellido, cedu, sueldo);

        suel1.calcularSueldoTotal();
        System.out.printf("%s\n%s\n", suel, suel1);
    }

}
