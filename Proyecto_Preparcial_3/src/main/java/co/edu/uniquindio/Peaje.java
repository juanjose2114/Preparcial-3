package co.edu.uniquindio;

import java.util.ArrayList;

public class Peaje {

    private String nombre;
    private String ubicacion;
    private double montoTotal;
    private ArrayList<Conductor> conductores;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Recaudador> recaudadores;

    public Peaje(String nombre, String ubicacion, double montoTotal) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.montoTotal = montoTotal;
        vehiculos = new ArrayList<>();
        recaudadores = new ArrayList<>();
        conductores = new ArrayList<>();
    }

    public boolean asignarVehiculo(Conductor conductor, Vehiculo vehiculo) {
        return false;
    }

    public ArrayList<Vehiculo> vehiculosDeConductor(Conductor conductor, Camion camion) {
        return null;
    }

    public ArrayList<Vehiculo> vehiculosDeConductor(Vehiculo vehiculo, Carro carro) {
        return null;
    }

    public ArrayList<Vehiculo> vehiculosDeConductor(Vehiculo vehiculo, Moto Moto) {
        return null;
    }

    public double cobrarPeaje(Vehiculo vehiculo) {
        if(vehiculo instanceof Camion){

        } else if(vehiculo instanceof Carro){
            
        } else if(vehiculo instanceof Moto){

        }
        return 0;
    }

    public Recaudador buscarRecaudador(String nombre, String apellido) {
        return null;
    }
}
