package Vehiculo;

public class Vehiculo {
    String Placa;

    Vehiculo (String placa) {
        this.Placa = Placa;
    }

    void mostrarInfo(){
        System.out.println("Placa del carro: "+ Placa);
    }
}