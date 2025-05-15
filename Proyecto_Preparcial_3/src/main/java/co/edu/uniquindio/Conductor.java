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
        vehiculos = new ArrayList();
    }

    public double pagadoPorVehiculo() {
        return 0;
    }

}
