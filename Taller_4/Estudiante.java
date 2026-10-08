package Taller_4;

public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 5) {
            this.nota = nota;
        }
    }
}