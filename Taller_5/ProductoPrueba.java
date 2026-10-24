package Taller_5;

public class ProductoPrueba {
    public static void main(String[] args){

        Producto Producto1 = new Producto("leche",450.0, 200);

        System.out.println("Nombre del producto: "+ Producto1.nombre);
        System.out.println("Precio del producto: "+ Producto1.precio);
        System.out.println("Stock del producto: "+ Producto1.stock);

        Producto1.mostrarInfo();
    }
}
