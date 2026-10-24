package Taller_5;

public class Prueba {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Maria", 21);

        System.out.println("Edad: " + persona1.edad);

        System.out.println("Nombre: " + persona1.getNombre());

        persona1.setNombre("MEY");

        System.out.println("Nuevo nombre: " + persona1.getNombre());
    }

    /*
     * La diferencia entre los atributos private y default es que private permite acceder al atributo únicamente desde la misma clase,
     * pero no desde otra clase, aunque pertenezca al mismo paquete. Además, se pueden utilizar métodos
     * get y set públicos para consultar o modificar el atributo.
     * En cambio, `default` permite acceder al atributo desde la misma clase y también desde otras clases que
     * pertenezcan al mismo paquete. Por eso, se puede acceder directamente al atributo desde la clase de
     * prueba si ambas clases están en el mismo paquete.
     */

}
