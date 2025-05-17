package co.edu.uniquindio;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class PeajeTest {

    Peaje peaje = new Peaje("","");
    Conductor conductor = new Conductor("nombre", "apellido", "id", "fechaNacimiento");
    Recaudador recaudador = new Recaudador("Nombre SegundoNombre", "Apellido", "id", "fechaNacimiento", 1000000);

    private static final Logger LOG = Logger.getLogger(PeajeTest.class.getName());

    @Test
    void testAsignarVehiculo() {
        LOG.info("Inicio prueba asignarVehiculo");

        Camion camion = new Camion("ABC 001",1, 5000);
        assertTrue(peaje.asignarVehiculo(conductor,camion));
        LOG.info("Fin prueba asignarVehiculo");
    }

    @Test
    void testVehiculosDeConductor() {
        LOG.info("Inicio prueba vehiculosDeConductor");

        Camion camion = new Camion("ABC 001",1, 5000);
        Moto moto = new Moto("ABC 002", 134);
        Carro carro = new Carro("ABC 003", false, false);
        Carro carlo = new Carro("ABC 004", true, false);

        peaje.asignarVehiculo(conductor, camion);
        peaje.asignarVehiculo(conductor, moto);
        peaje.asignarVehiculo(conductor, carro);
        peaje.asignarVehiculo(conductor, carlo);

        assertTrue(peaje.vehiculosDeConductor(conductor, "Camion").size() == 1 && peaje.vehiculosDeConductor(conductor, "Carro").size() == 2 && peaje.vehiculosDeConductor(conductor, "Moto").size() == 1);

        LOG.info("Fin prueba vehiculosDeConductor");
    }

    @Test
    void cobrarPeaje() {
        LOG.info("Inicio prueba cobrarPeaje");

        Camion camion = new Camion("ABC 001",6, 22);
        Moto moto = new Moto("ABC 002", 134);
        Carro carro = new Carro("ABC 003", true, true);

        assertEquals(44000 , peaje.cobrarPeaje(camion), 0.5);
        assertEquals(5000 , peaje.cobrarPeaje(moto), 0.5);
        assertEquals(9200 , peaje.cobrarPeaje(carro), 0.5);

        LOG.info("Fin prueba cobrarPeaje");
    }

    @Test
    void buscarRecaudador() {
        LOG.info("Inicio prueba buscarRecaudador");

        peaje.agregarRecaudador(recaudador);
        assertEquals(recaudador, peaje.buscarRecaudador(recaudador.nombre(), recaudador.apellido()));

        LOG.info("Fin prueba buscarRecaudador");
    }
}