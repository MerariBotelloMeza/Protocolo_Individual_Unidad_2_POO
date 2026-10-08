package Taller_4;

public class Prueba_2 {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Tesla", "S", 200);

        /*
         * la manera incorrecta
         * coche1.marca = "Mercedes";
         * coche1.modelo = "mm-gj";
         * coche1.velocidadMaxima = 300;
         *
         * */

        // la manera correcta

        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Velocidad máxima: " + coche1.getVelocidadMaxima());

        coche1.acelerar(20);

        System.out.println("Nueva velocidad máxima: " + coche1.getVelocidadMaxima());


    }
}
