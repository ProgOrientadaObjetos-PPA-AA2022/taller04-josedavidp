/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author josed
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatriculaVehiculo mat = new MatriculaVehiculo();
        mat.calcularValorMatricula();

        String name = "1124849345";
        String brand = "Subaru";
        int man = 2000;
        double costo = 12348.78;

        MatriculaVehiculo mat1 = new MatriculaVehiculo(name, brand, man, costo);

        mat1.calcularValorMatricula();
        System.out.printf("%s\n%s\n", mat, mat1);
    }

}
