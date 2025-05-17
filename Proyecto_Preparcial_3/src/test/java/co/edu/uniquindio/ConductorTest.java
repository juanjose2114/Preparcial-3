package co.edu.uniquindio;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class ConductorTest {

    Peaje peaje = new Peaje("","");
    Conductor conductor = new Conductor("nombre", "apellido", "id", "fechaNacimiento");
    private static final Logger LOG = Logger.getLogger(PeajeTest.class.getName());

    @Test
    void pagadoPorVehiculo() {
        LOG.info("Inicio prueba pagadoPorVehiculo");
        Camion camion = new Camion("ABC 001",1, 5000);
        Moto moto = new Moto("ABC 002", 134);
        Carro carro = new Carro("ABC 003", false, false);
        Carro carlo = new Carro("ABC 004", true, false);

        peaje.asignarVehiculo(conductor, camion);
        peaje.asignarVehiculo(conductor, moto);
        peaje.asignarVehiculo(conductor, carro);
        peaje.asignarVehiculo(conductor, carlo);


        LOG.info("Fin prueba pagadoPorVehiculo");
    }
}