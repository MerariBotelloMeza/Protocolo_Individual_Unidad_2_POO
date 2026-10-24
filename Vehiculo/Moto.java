package Vehiculo;

public class Moto extends Vehiculo{

    Moto (String Placa){
        super(Placa);
    }
    void mostrarMoto() {
        System.out.println("placa de la moto: " + Placa);
    }
}
