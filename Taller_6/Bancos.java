package Taller_6;

public class Bancos {
    private double saldo;

    public Bancos (double saldoinicial){
        if (saldoinicial >= 0) {
            this.saldo = saldoinicial;
        } else {
            this.saldo = 0;
        }
    }
    public double getSaldo(){
        return saldo;
    }

    /*De esta manera es más seguro utilizando private, ya que solo esta clase
     * puede acceder directamente al atributo. Si una clase hija u otra clase
     * del paquete necesita el valor, debe hacerlo mediante el metodo getSaldo().
     */
}
