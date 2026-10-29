package Prueba_taller6;

import Taller_6.Vehiculo;

public class Prueba_acceso {
    public static void main(String[] args){
        Vehiculo Vehiculo1 = new Vehiculo("micro", "honda");

        System.out.println(Vehiculo1.tipo);
        System.out.println(Vehiculo1.marca);

        Vehiculo1.mostrarInfor();
    }
    /*
    * Lo que podemos observar en este ejercicio es la manera incorrecta de
    * intentar acceder a la información cuando está como protected, ya que
    * a estos atributos solo se puede acceder desde cualquier clase del
    * mismo paquete o bien desde subclases en otros paquetes; por eso,
    * al intentar ingresar desde una clase no relacionada y en otro paquete,
    *  el compilador genera un error y bloquea el acceso.
    * */

}
