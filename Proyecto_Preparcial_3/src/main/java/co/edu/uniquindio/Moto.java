package co.edu.uniquindio;

public class Moto extends Vehiculo {

    private double cilindraje;

    public Moto(String placa, String peajesPagados, double cilindraje) {
        super(placa, peajesPagados);
        this.cilindraje = cilindraje;
    }

    @Override
    public String datosVehiculo() {
        String s = "";

        return s;
    }
}
