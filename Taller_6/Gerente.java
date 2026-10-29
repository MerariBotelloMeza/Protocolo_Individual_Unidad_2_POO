package Taller_6;

public class Gerente extends Empleado{
   private String departamento;

   public Gerente(String nombre, double salario, String departamento){
       super(nombre, salario);
       this.departamento = departamento;
   }
   @Override
    protected void mostrarInfor(){
       super.mostrarInfor();
       System.out.println("Departamento: "+ departamento);
   }
}
