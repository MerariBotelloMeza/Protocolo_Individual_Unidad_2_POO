package Taller_6;

public class Banco {
    protected double saldo;

    public Banco (double saldoinicial){
        this.saldo= saldoinicial;
    }
    /*
    * Esta implementación es insegura porque cualquier clase dentro del
    * mismo paquete puede acceder y modificar el saldo directamente sin
    * restricciones. Por lo tanto, el uso de protected no permite proteger
    * adecuadamente los datos sensibles de los usuarios, */
}
