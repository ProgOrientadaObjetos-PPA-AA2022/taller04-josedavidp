/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author josed
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheques co = new Cheques();
        co.calcularComisionBanco();

        String nombreP = "Alexander Muñoz";
        String nombreBanc = "Banco del Austro";
        double valor = 298.21;

        Cheques chq1 = new Cheques(nombreP, nombreBanc, valor);

        chq1.calcularComisionBanco();
        System.out.printf("%s\n%s\n", co, chq1);
    }

}
