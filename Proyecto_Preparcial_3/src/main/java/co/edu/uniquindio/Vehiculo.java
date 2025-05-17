package co.edu.uniquindio;

public abstract class Vehiculo {

    public String placa;
    public int peajesPagados;
    public double totalPagado;

    public Vehiculo(String placa, int peajesPagados, double totalPagado) {
        this.placa = placa;
        this.peajesPagados = peajesPagados;
        this.totalPagado = totalPagado;
    }

    public abstract String datosVehiculo();

    public abstract void cobroRealizado(double cobro);

    public abstract String getPlaca();
    public abstract int getPeajesPagados();
    public abstract double getTotalPagado();
}
