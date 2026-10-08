package Taller_4;

public class Prueba_1 {
        public static void main(String[] args) {

            Estudiante estudiante1 = new Estudiante("Mery", 21, 4.5);

            System.out.println("Nombre: " + estudiante1.getNombre());
            System.out.println("Edad: " + estudiante1.getEdad());
            System.out.println("Nota promedio: " + estudiante1.getNota());

            estudiante1.setNombre("Mery");
            estudiante1.setEdad(21);
            estudiante1.setNota(4.9);

            System.out.println("\nDatos actualizados:");
            System.out.println("Nombre: " + estudiante1.getNombre());
            System.out.println("Edad: " + estudiante1.getEdad());
            System.out.println("Nota promedio: " + estudiante1.getNota());
        }
}
