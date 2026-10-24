package Taller_5;

public class Persona {
    private String Nombre;
    int edad;

    Persona(String nombre, int edad){
        this.Nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre( String Nombre) {
        this.Nombre = Nombre;
    }
}
