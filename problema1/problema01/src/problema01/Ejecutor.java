/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

/**
 *
 * @author josed
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calificaciones cal = new Calificaciones();
        cal.calcularPromedio();

        String nombreEst = "Wilson Gabriel";
        double mater1 = 7.8;
        double mater2 = 8.2;
        double mater3 = 9.6;

        Calificaciones cal1 = new Calificaciones(nombreEst, mater1, mater2,
                mater3);

        cal1.calcularPromedio();
        System.out.printf("%s\n%s\n", cal, cal1);
    }
    
}
