/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author josed
 */
public class MatriculaVehiculo {

    private String cedula;
    private String marca;
    private int anio;
    private double valor;
    private double valorMatricula;


    public MatriculaVehiculo() {
        cedula = "11054888545";
        marca = "Ferrari";
        anio = 1998;
        valor = 255689.96;

    }

    public MatriculaVehiculo(String ced, String marc,
            int fabric, double costoV) {

        cedula = ced;
        marca = marc;
        anio = fabric;
        valor = costoV;

    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerAniofabricacion(int c) {
        anio = c;
    }

    public void establecerValorVehiculo(double c) {
        valor = c;
    }

    public void calcularValorMatricula() {
        valorMatricula = (valor * 0.002) * (2022 - anio);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAniofabricacion() {
        return anio;
    }

    public double obtenerValorVehiculo() {
        return valor;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Valor de la Matricula: \n"
                + "Cedula del propietario: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de Fabricacion del vehiculo : %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor de la matricula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAniofabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());

        return cadena;
    }
}
