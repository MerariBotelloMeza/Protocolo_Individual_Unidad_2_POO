package Prueba;

import vehiculos.Vehiculo;
import vehiculos.Moto;

public class PruebaVehiculo {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("SDF225");
        Moto moto1 = new Moto("MJH523");

        System.out.println(vehiculo1.Placa);
        vehiculo1.mostrarInfo();

        System.out.println(moto1.Placa);
        moto1.mostrarMoto();

        /*
        * Este error sucedió porque Java utiliza modificadores de acceso para controlar desde dónde
        * se pueden utilizar las propiedades, los constructores y los métodos. Cuando no utilizamos modificadores
        *  de acceso, Java asigna por defecto el acceso de paquete default. Esto quiere decir que solo se puede acceder
        * a esos miembros desde clases que pertenezcan al mismo paquete.
        * Aunque la clase Moto hereda de Vehiculo, la herencia no elimina las restricciones de acceso.
        *  Por eso, la relación con Vehiculo no permite que una clase de otro paquete acceda a sus miembros con acceso de paquete.
        * Es decir, los miembros con acceso de paquete solo pueden utilizarse directamente desde clases del mismo paquete.
        * Si queremos que se pueda acceder a ellos desde otros paquetes, debemos cambiar los modificadores de acceso según lo que se necesite.*/
    }
}
