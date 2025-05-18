package co.edu.uniquindio;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Peaje peaje = new Peaje("", "");
        Conductor conductor1 = new Conductor("conductor","","","");
        Conductor conductor2 = new Conductor("conductor2","","","");
        Recaudador r = new Recaudador("Manu Jime", "JOtas23", "123", "1", 0);
        Carro carro = new Carro("123",true,true);
        Camion camion = new Camion("122", 4, 4);
        String Sconductor;
        Conductor conductor;
        Vehiculo vehiculo;
        String placa;
        String j;

        int caso1;
        int caso2;
        for (int i = 1; i != 0; i++) {
            caso1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Menu Funciones
                    1 para funciones basicas
                    2 para funciones logicas
                    3 para salir
                    """));
            switch (caso1) {
                case 1:
                    caso2 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Menu funciones basicas
                    1 para crear conductor
                    2 para crear vehiculo
                    3 para crear recaudador
                    """));
                    switch (caso2) {
                        case 1:
                            j = i + "";
                            conductor = new Conductor("conductor" + j,"basico",j,"edad");
                            peaje.agregarConductor(conductor);
                            System.out.println(peaje.agregarConductor(conductor));
                            break;
                        case 2:
                            j = i + "";
                            Carro carro2 = new Carro(j ,true,true);

                        default:
                            break;
                    }
                    break;
                case 2:
                    caso2 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Menu funciones logicas
                    1 Para asignar Vehiculo
                    2 para informe vehiculos que pasaron
                    3 para describcion de vehiculo
                    4 para total pagado por persona
                    5 vehiculos de conductor segun el tipo
                    6 para cobrar a vehiculo
                    7 para buscar recaudador por nombre
                    8 para salir
                    """));
                    switch (caso2) {
                        case 1:
                            Sconductor = JOptionPane.showInputDialog(null, "ingrese la cecula del conductor a cobrar");
                            placa = JOptionPane.showInputDialog(null, "ingrese la placa del vehiculo a cobrar");
                            conductor = peaje.buscarConductor(Sconductor);
                            if (conductor != null) {
                                peaje.asignarVehiculo(conductor, carro);
                                peaje.asignarVehiculo(conductor, camion);
                            }
                            break;
                        case 2:
                            //  Imprimir en pantalla un listado de los vehículos que llegaron al peaje, el tipo de vehículo,
                            //  el cálculo detallado de cada peaje y el total acumulado.
                            for (String s: peaje.getRegistro()){
                                System.out.println(s);
                            }
                            System.out.println("moto total de: " + peaje.getMontoTotal());
                            break;
                        case 3:
                            System.out.println(carro.datosVehiculo());
                            break;
                        case 4:
                            double pagado = 0;
                            ArrayList<Vehiculo> vehiculos = conductor1.getVehiculos();
                            for (Vehiculo vehiculoc : vehiculos) {
                                pagado += vehiculoc.getTotalPagado();
                            }
                            System.out.println(pagado);
                            break;
                        case 5:
                            Sconductor = JOptionPane.showInputDialog(null, "ingrese el id del conductor");
                            if (peaje.buscarConductor(Sconductor) != null) {
                                Conductor con = peaje.buscarConductor(Sconductor);
                                String tipo = JOptionPane.showInputDialog(null, "ingrese el tipo de vehiculo a imprimir");
                                for (Vehiculo vehiculoc : peaje.vehiculosDeConductor(con, tipo)) {
                                    vehiculoc.datosVehiculo();
                                }
                            }
                            break;
                        case 6:
                            Sconductor = JOptionPane.showInputDialog(null, "ingrese la cecula del conductor a cobrar");
                            placa = JOptionPane.showInputDialog(null, "ingrese la placa del vehiculo a cobrar");
                            conductor = peaje.buscarConductor(Sconductor);
                            if (conductor != null) {
                                for (Vehiculo vehiculoc : conductor.getVehiculos()) {
                                    if (vehiculoc.getPlaca().equals(placa)) {
                                        peaje.cobrarPeaje(vehiculoc);
                                    }
                                }
                            }
                            break;
                        case 7:
                            String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del recaudador");
                            String apellido = JOptionPane.showInputDialog(null, "ingrese el apellido del recaudador");
                            Recaudador recaudador = peaje.buscarRecaudador(nombre, apellido);
                            if (recaudador != null) {
                                System.out.println(recaudador.toString());
                            } else {
                                JOptionPane.showMessageDialog(null, "El recaudador de nombre " + nombre + " y apellido " + apellido + " no existe");
                            }
                            break;
                        default:// igualmente sale solo por lo que la opcion 8 solo es decoracion
                            break;
                    }
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    break;
            }
        }
    }
}