package Taller_6;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada){
        super(tipo,marca);
        this.cilindrada = cilindrada;
    }

    @Override

    protected void mostrarInfor(){
        super.mostrarInfor();
        System.out.println("cilindrada: "+ cilindrada+" cc");
    }
}
