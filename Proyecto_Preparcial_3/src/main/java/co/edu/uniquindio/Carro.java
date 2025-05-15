package co.edu.uniquindio;

public class Carro extends Vehiculo{

    private boolean electrico, servicio;

    public Carro(String placa, String peajesPagados, boolean electrico, boolean servicio) {
        super(placa, peajesPagados);
        this.electrico = electrico;
        this.servicio = servicio;
    }

    @Override
    public String datosVehiculo() {
        String s = "";

        return s;
    }
}
