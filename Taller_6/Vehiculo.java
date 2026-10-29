package Taller_6;

public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca){
        this.marca = marca;
        this.tipo = tipo;
    }

    protected void mostrarInfor(){
        System.out.println("Marca: "+ marca+ " tipo: "+tipo);
    }
}
