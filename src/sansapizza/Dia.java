/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sansapizza;
import java.util.ArrayList;
/**
 *
 * @author maligno
 */
public class Dia {
   private int Cp;
   private int Cs;
   private int Ca;
   private int Cr;
   private int Cf;
   private int sueldo;
   private int ingreso;
   private int costo;
   private int resultado;
    
   public Dia(){
       Cp = 0;
       Cs = 0;
       Ca = 0;
       Cr = 0;
       Cf = 0;
       sueldo = 0;
       ingreso = 0;
       costo = 0;
       resultado = 0;
   }
    
    /******** Metodo: Grupo de getters y setters ********************
    Descripcion: Los setters cambian el valor de varibles de la clase, mientras los getters lo obtienen
    Parametros:
    int n (solo setters)
    Retorno: Para los getters, retorna los valores, y para los setters no hay retorno
    ************************************************/
   public void setCs(int n){
       this.Cs = n;
   }
   public void setCa(int n){
       this.Ca = n;
   }
   public void setCr(int n){
       this.Cr = n;
   } 
   public void setCf(int n){
       this.Cf = n;
   }
   public void setSueldo(int n){
       this.sueldo = n;
   }
   public void setIngreso(int n){
       this.ingreso = n;
   } 
   public void setCosto(int n){
       this.costo = n;
   }
   public void setResultado(int n){
       this.resultado = n;
   } 
   public int getCp(){
       return this.Cp;
   }
   
   public int getCs(){
       return this.Cs;
   }
   
   public int getCa(){
       return this.Ca;
   }
   
   public int getCr(){
       return this.Cr;
   }
   public int getCf(){
       return this.Cf;
   }
   public int getSueldo(){
       return this.Cp;
   }
   public int getIngreso(){
       return this.ingreso;
   }
   public int getCosto(){
       return this.costo;
   }
   
   public int getResultado(){
       return this.resultado;
   }
   /****************Fin Setters y Getters***********************
   
   
    /******** Metodo: calcularClientesComiendo ********************
    Descripcion: Calcula Cr y Ca, para luego cambiar las intancias en esta clase al iterar sobre la lista de empleados
    Parametros:
    * Local local (local actual)
    Retorno: no hay retorno
    ************************************************/
   public void calcularClientesComiendo(Local local){
       ArrayList<Empleado> Empleados = local.getEmpleados();
       for (Empleado Empleado : Empleados){
           Empleado.realizarEmpleo(this);
       }
   }
   
    /******** Metodo: calcularClientesSentados ********************
    Descripcion: Calcula la cantidad de clientes que se pueden sentar en las mesas (Cs)
    Parametros:
    * Local local (local actual)
    Retorno: no hay retorno
    ************************************************/
   public void calcularClientesSentados(Local local){
       ArrayList<Mesa> Mesas = local.getMesas();
       for (Mesa Mesa : Mesas) {
           Mesa.Contabilizar(this);
       }
   }
   
    /******** Metodo: calcularClientesPotenciales ********************
    Descripcion: Calcula los clientes que se interesan en comer en el local, segun su popularidad
    Parametros:
    * Local local (local actual)
    Retorno: no hay retorno
    ************************************************/
   public void calcularClientesPotenciales(Local local){
       this.Cp = (int) (20 * local.getPopularidad());
   }
   
    /******** Metodo: calcularClientesFelices ********************
    Descripcion: Obtiene los clientes que pudieron ser atendidos, siendo estos el minimo entre
    * los que se puedieron sentar (Cs) o los que puedieron ser atendidos por los meseros(Ca) o los cocineros (Cr)
    * o los clientes que se interesaron en el local (Cp)
    Parametros:
    Retorno: no hay retorno
    ************************************************/
   public void calcularClientesFelices(){
       this.Cf = Math.min(Math.min(Cp, Cr), Math.min(Ca, Cs));
       System.out.println(this.Cp);
       System.out.println(this.Cr);
       System.out.println(this.Ca);
       System.out.println(this.Cs);
   }
   
    /******** Metodo: calcularIngreso ********************
    Descripcion: Retorna lo ganado segun los clientes que pagaron
    Parametros: Local local(local actual)
    Retorno: no hay retorno
    ************************************************/
   public void calcularIngreso(Local local){
       this.ingreso = this.Cf * local.getComida().getPrecio();
   }
   
    /******** Metodo: calcularSueldoDiario ********************
    Descripcion: Calcula el costo obtenido del sueldo de los empleados del local
    Parametros: Local local (local actual)
    Retorno: no hay retorno
    ************************************************/
   public void calcularSueldoDiario(Local local){
       for (Empleado esclavo : local.getEmpleados()){
           esclavo.pagarSueldo(this);
       }
   }
   
    /******** Metodo: calcularCosto ********************
    Descripcion: Calcula el costo total del local
    Parametros: Local local (local actual)
    Retorno: no hay retorno
    ************************************************/
   public void calcularCosto(Local local){
       int min = Math.min(Math.min(Ca, Cs), Cp);
       this.costo = local.getComida().getCosto() * min + this.sueldo;
   }
   
    /******** Metodo: totalDiario ********************
    Descripcion: Calcula las perdidas o ganancias diarias del local
    Parametros: 
    Retorno: no hay retorno
    ************************************************/
   public void totalDiario(){
       this.resultado = this.ingreso - this.costo;
   }
}
