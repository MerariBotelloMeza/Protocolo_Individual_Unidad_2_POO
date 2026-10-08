package Taller_4;

public class Persona {
    private String Nombre;

    public Persona(String Nombre){
        this.Nombre = Nombre;

    }

    public class main {
        public static void main(String[] args){
            Personas P = new Persona ("Marilis");
            System.out.println(P.Nombre);

            /* aqui hay un error de compilación ya que esta intentando entrar
            * de manera directa a nombre que tiene un acceso privado
            * */


        }
    }
}
