package co.edu.uniquindio;

public class Main {
    public static void main(String[] args) {
        Peaje peaje = new Peaje("", "");
        Recaudador r = new Recaudador("Manu jimeNES" ,"JOtas23", "123", "1", 0);
        peaje.agregarRecaudador(r);
        System.out.println(peaje.buscarRecaudador(r.nombre(), r.apellido()).toString());
        System.out.println(peaje);
    }
}