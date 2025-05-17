package co.edu.uniquindio;

import java.util.ArrayList;

public class Conductor {

    private String nombre, apellido, id, fechaNacimiento;
    private ArrayList <Vehiculo> vehiculos;

    public Conductor(String nombre, String apellido, String id, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        vehiculos = new ArrayList<>();
    }

    public double pagadoPorVehiculo(String tipoVehiculo) {
        double pagado = 0;
        Carro carro;
        Camion camion;
        Moto moto;

        Peaje peaje = new Peaje(null, null);
        for (Vehiculo vehiculo : vehiculos) {
            if (tipoVehiculo.equals("Carro")){
                if (vehiculo instanceof Carro){
                    carro = (Carro) vehiculo;
                    pagado += vehiculo.peajesPagados * peaje.cobrarPeaje(carro);
                }
            } else if (tipoVehiculo.equals("Moto")){
                if (vehiculo instanceof Moto){
                    moto = (Moto) vehiculo;
                    pagado += vehiculo.peajesPagados * peaje.cobrarPeaje(moto);
                }
            } else if (tipoVehiculo.equals("Camion")){
                if (vehiculo instanceof Camion){
                    camion = (Camion) vehiculo;
                    pagado += vehiculo.peajesPagados * peaje.cobrarPeaje(camion);
                }
            }

        }
        return pagado;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        return vehiculos.add(vehiculo);
    }
}