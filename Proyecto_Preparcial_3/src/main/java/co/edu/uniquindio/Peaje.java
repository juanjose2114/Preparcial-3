package co.edu.uniquindio;

import java.util.ArrayList;

public class Peaje {

    private String nombre;
    private String ubicacion;
    private double montoTotal;
    private ArrayList<Conductor> conductores;
    private ArrayList<Recaudador> recaudadores;

    public Peaje(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.montoTotal = 0;
        conductores = new ArrayList<>();
        recaudadores = new ArrayList<>();
    }

//------------------------------------metodos logicos-------------------------------------------------------------------

    public boolean asignarVehiculo(Conductor conductor, Vehiculo vehiculo) {
        for (Vehiculo v : conductor.getVehiculos()) {
            if (vehiculo.getPlaca().equals(v.getPlaca())) {
                return false;
            }
        }
        return conductor.agregarVehiculo(vehiculo);
    }

    /**
     * funcion que retornara los vehiculos de cirto tipo de una persona
     * @param conductor dueño a analizar
     * @param tipoVehiculo sea Carro, Moto o Camion
     * @return ArrayList<Vehiculo>
     */
    public ArrayList<Vehiculo> vehiculosDeConductor(Conductor conductor, String tipoVehiculo) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        if (!tipoVehiculo.equals("Camion") && !tipoVehiculo.equals("Carro") && !tipoVehiculo.equals("Moto")) {
            return null;
        }
        for (Vehiculo v : conductor.getVehiculos()) {
            switch (tipoVehiculo) {
                case "Camion":
                    if (v instanceof Camion) {
                        vehiculos.add(v);
                    }
                    break;
                case "Carro":
                    if (v instanceof Carro) {
                        vehiculos.add(v);
                    }
                    break;
                case "Moto":
                    if (v instanceof Moto) {
                        vehiculos.add(v);
                    }
                    break;
                default:
                    break;
            }
        }
        return vehiculos;
    }

    /**
     * funcion que cobrara segun el tipo de vehiculo
     * param carro a cobrar
     * @return double
     */
    public double cobrarPeaje(Carro carro) {
        double precio = 10000;
        if (carro.isElectrico()){
            precio *= 0.8;
        }
        if (carro.isServicio()){
            precio *= 1.15;
        }
        carro.cobroRealizado(precio);
        return precio;
    }

    /**
     * funcion que cobrara segun el tipo de vehiculo
     * param vehiculo a cobrar
     * @return double
     */
    public double cobrarPeaje(Moto moto) {
        double precio = 5000;
        if (moto.getCilindraje() > 200){
            precio += 2000;
        }
        moto.cobroRealizado(precio);
        return precio;
    }

    /**
     * funcion que cobrara segun el tipo de vehiculo
     * param carro a cobrar
     * @return double
     */
    public double cobrarPeaje(Camion camion) {
        double precio = 7000 * camion.getEjes();
        if (camion.getCargaT() > 10){
            System.out.println(camion.getCargaT());
            precio += 2000;
        }
        camion.cobroRealizado(precio);
        return precio;
    }

    /**
     * busca un recaudador mediante el nombre y el apellido si tomar en cuenta mayusculas y espacios
     * @param nombre
     * @param apellido
     * @return Recaudador
     */
    public Recaudador buscarRecaudador(String nombre, String apellido) {
        String recaudador = nombre + apellido;
        recaudador = recaudador.toLowerCase().replace(" ", "");
        String recNombre;
        for (Recaudador rec : recaudadores) {
            recNombre = rec.nombre() + rec.apellido();
            recNombre = recNombre.toLowerCase().replace(" ", "");
            if (recNombre.equals(recaudador)){
                return rec;
            }
        }
        return null;
    }



//------------------------------------metodos funcionales---------------------------------------------------------------

    /**
     * metodo para agregar un recaudador
     * @param recaudador a agregar
     * @return boolean
     */
    public boolean agregarRecaudador(Recaudador recaudador) {
        return recaudadores.add(recaudador);
    }

    /**
     * metodo para eliminar un recaudador
     * @param recaudador a eliminar
     * @return boolean
     */
    public boolean eliminarRecaudador(Recaudador recaudador) {
        return recaudadores.remove(recaudador);
    }
}
