package co.edu.uniquindio;

public class Moto extends Vehiculo {

    private double cilindraje;

    public Moto(String placa, double cilindraje) {
        super(placa, 0, 0);
        this.cilindraje = cilindraje;
    }

    @Override
    public String datosVehiculo() {
        String s = "Placa: " + placa + "\nPeajes Pagados: " + peajesPagados + "\nTotal Pagado: " + totalPagado + "\nCilindraje: " + cilindraje;
        return s;
    }

    @Override
    public void cobroRealizado(double cobro){
        peajesPagados += 1;
        totalPagado += cobro;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public int getPeajesPagados(){
        return peajesPagados;
    }

    @Override
    public  double getTotalPagado(){
        return totalPagado;
    }

}
