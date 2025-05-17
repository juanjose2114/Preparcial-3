package co.edu.uniquindio;

public class Carro extends Vehiculo{

    private boolean electrico, servicio;

    public Carro(String placa, boolean electrico, boolean servicio) {
        super(placa, 0, 0);
        this.electrico = electrico;
        this.servicio = servicio;
    }

    @Override
    public String datosVehiculo() {
        String s =  "Placa: " + placa + "\nPeajes Pagados: " + peajesPagados + "\nTotal Pagado: " + totalPagado + "\nElectrico: " + electrico + "\nServicio: " + servicio;

        return s;
    }


    @Override
    public void cobroRealizado(double cobro){
        peajesPagados += 1;
        totalPagado += cobro;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public boolean isServicio() {
        return servicio;
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
