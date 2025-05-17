package co.edu.uniquindio;

public class Camion extends Vehiculo{

    private int ejes;
    private double cargaT;

    public Camion(String placa, int ejes, double cargaT){
        super(placa, 0, 0);
        this.ejes = ejes;
        this.cargaT = cargaT;
    }

    @Override
    public String datosVehiculo(){
        String s = "Placa: " + placa + "\nPeajes Pagados: " + peajesPagados + "\nTotal Pagado: " + totalPagado + "\nEjes: " + ejes + "\nCarga T: " + cargaT;
        return s;
    }

    @Override
    public void cobroRealizado(double cobro){
        peajesPagados += 1;
        totalPagado += cobro;
    }

    public int getEjes() {
        return ejes;
    }

    public double getCargaT() {
        return cargaT;
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