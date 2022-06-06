/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema04;

/**
 *
 * @author josed
 */
public class Cheques {

    private String nombre;
    private String banco;
    private double valorCheque;
    private double comision;

    public Cheques() {
        nombre = "Rafael Domínguez";
        banco = "Banco de Loja";
        valorCheque = 846.47;

    }

    public Cheques(String nom, String ban,
            double vCheque) {

        nombre = nom;
        banco = ban;
        valorCheque = vCheque;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerBanco(String c) {
        banco = c;
    }

    public void establecerCheque(double c) {
        valorCheque = c;
    }

    public void calcularComisionBanco() {
        comision = (valorCheque * 0.003);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Transaccion Bancaria: \n"
                + "Nombre: %s\n"
                + "Banco: %s\n"
                + "Valor del cheque : %.2f\n"
                + "Comision del banco: %.2f\n",
                obtenerNombre(),
                obtenerBanco(),
                obtenerCheque(),
                obtenerComisionBanco());

        return cadena;
    }
}
