package co.edu.uniquindio;

public abstract class Vehiculo {

    public String placa, peajesPagados;

    public Vehiculo(String placa, String peajesPagados) {
        this.placa = placa;
        this.peajesPagados = peajesPagados;
    }

    public abstract String datosVehiculo();
}
