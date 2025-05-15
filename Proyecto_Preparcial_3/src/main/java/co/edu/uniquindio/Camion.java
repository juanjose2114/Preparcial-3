package co.edu.uniquindio;

public class Camion extends Vehiculo{

    private int ejes;
    private double carga;
    public Camion(String placa, String peajesPagados, int ejes, double carga){
        super(placa, peajesPagados);
        this.ejes = ejes;
    }

    @Override
    public String datosVehiculo(){
        String s = "";

        return s;
    }
}