package Taller_5;

public class Producto {
    String nombre;
    Double precio;
    int stock;

    Producto(String nombre, Double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    void mostrarInfo(){
        System.out.println("Nombre: "+ nombre+", el Precio: "+precio+"El stock: "+ stock);
    }
}
