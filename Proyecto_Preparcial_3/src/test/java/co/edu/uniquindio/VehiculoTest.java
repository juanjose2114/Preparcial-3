package co.edu.uniquindio;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {

    Conductor conductor = new Conductor("nombre", "apellido", "id", "fechaNacimiento");
    private static final Logger LOG = Logger.getLogger(PeajeTest.class.getName());

    @Test
    void datosVehiculo() {
        LOG.info("Inicio prueba datosVehiculo");

        Camion camion = new Camion("ABC 001",1, 5000);
        String camionString = "Placa: " + camion.getPlaca() + "\nPeajes Pagados: " + camion.getPeajesPagados() + "\nTotal Pagado: " + camion.getTotalPagado() + "\nEjes: " + camion.getEjes()+ "\nCarga T: " + camion.getCargaT();

        Moto moto = new Moto("ABC 002", 134);
        String motoString = "Placa: " + moto.getPlaca() + "\nPeajes Pagados: " + moto.getPeajesPagados() + "\nTotal Pagado: " + moto.getTotalPagado() + "\nCilindraje: " + moto.getCilindraje();

        Carro carro = new Carro("ABC 003", false, false);
        String carroString= "Placa: " + carro.getPlaca() + "\nPeajes Pagados: " + carro.getPeajesPagados() + "\nTotal Pagado: " + carro.getTotalPagado() + "\nElectrico: " + carro.isElectrico() + "\nServicio: " + carro.isServicio();
        assertTrue(camion.datosVehiculo().equals(camionString) && moto.datosVehiculo().equals(motoString) && carro.datosVehiculo().equals(carroString));

        LOG.info("Fin prueba datosVehiculo");
    }
}